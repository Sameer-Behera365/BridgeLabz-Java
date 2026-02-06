package javacollectionsandstreams.java8features;

import java.util.*;
import java.util.stream.*;

class Txn {
    String policy; double amt; boolean fraud;
    Txn(String p,double a,boolean f){policy=p;amt=a;fraud=f;}
}

public class FraudDetection {
    public static void main(String[] args) {

        List<Txn> list = List.of(
                new Txn("P1",20000,true),
                new Txn("P1",15000,true),
                new Txn("P2",5000,true)
        );

        Map<String,DoubleSummaryStatistics> stats =
                list.stream()
                        .filter(t->t.fraud && t.amt>10000)
                        .collect(Collectors.groupingBy(
                                t->t.policy,
                                Collectors.summarizingDouble(t->t.amt)
                        ));

        stats.forEach((k,v)->{
            if(v.getCount()>5 || v.getSum()>50000)
                System.out.println("ALERT "+k);
        });
    }
}