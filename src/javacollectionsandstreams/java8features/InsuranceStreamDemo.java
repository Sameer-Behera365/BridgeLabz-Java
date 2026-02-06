package javacollectionsandstreams.java8features;

import java.util.*;
import java.util.stream.*;

class Policy {
    String num,name; double premium;
    Policy(String n,String h,double p){num=n;name=h;premium=p;}
}

public class InsuranceStreamDemo {
    public static void main(String[] args) {

        List<Policy> list = List.of(
                new Policy("P1","Smith",1500),
                new Policy("P2","Sam",900),
                new Policy("P3","Scott",2100)
        );

        list.stream().filter(p->p.premium>1200).forEach(p->System.out.println(p.num));

        double total = list.stream().mapToDouble(p->p.premium).sum();
        System.out.println(total);

        Map<Character,List<Policy>> g =
                list.stream().collect(Collectors.groupingBy(p->p.name.charAt(0)));
        System.out.println(g);

        boolean any = list.stream().anyMatch(p->p.premium>2000);
        System.out.println(any);
    }
}
