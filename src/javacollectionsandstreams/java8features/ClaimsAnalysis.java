package javacollectionsandstreams.java8features;

import java.util.*;
import java.util.stream.*;

class Claim {
    String policy; double amt; String status;
    Claim(String p,double a,String s){policy=p;amt=a;status=s;}
}

public class ClaimsAnalysis {
    public static void main(String[] args) {

        List<Claim> list = List.of(
                new Claim("P1",6000,"Approved"),
                new Claim("P1",7000,"Approved"),
                new Claim("P2",3000,"Pending")
        );

        Map<String,DoubleSummaryStatistics> stats =
                list.stream()
                        .filter(c->c.status.equals("Approved") && c.amt>5000)
                        .collect(Collectors.groupingBy(
                                c->c.policy,
                                Collectors.summarizingDouble(c->c.amt)
                        ));

        stats.entrySet().stream()
                .sorted((a,b)->Double.compare(
                        b.getValue().getSum(),
                        a.getValue().getSum()))
                .limit(3)
                .forEach(System.out::println);
    }
}