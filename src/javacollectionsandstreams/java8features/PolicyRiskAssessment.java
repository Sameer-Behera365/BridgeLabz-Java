package javacollectionsandstreams.java8features;

import java.util.*;
import java.util.stream.*;

class Holder {
    int id, age; String name,type; double premium;
    Holder(int i,String n,int a,String t,double p){
        id=i;name=n;age=a;type=t;premium=p;
    }
}

public class PolicyRiskAssessment {
    public static void main(String[] args) {

        List<Holder> list = List.of(
                new Holder(1,"A",65,"Life",500),
                new Holder(2,"B",70,"Life",600),
                new Holder(3,"C",50,"Health",400)
        );

        Map<String,List<Holder>> map =
                list.stream()
                        .filter(h->h.type.equals("Life") && h.age>60)
                        .collect(Collectors.groupingBy(
                                h -> (h.premium/h.age)>0.5 ? "High" : "Low"
                        ));

        System.out.println(map);
    }
}
