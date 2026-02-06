package javacollectionsandstreams.java8features;

import java.util.*;

class Person {
    String name; int age;
    Person(String n,int a){name=n;age=a;}
}

public class PersonSortByAge {
    public static void main(String[] args) {
        List<Person> p=List.of(new Person("A",30),new Person("B",20));
        p.stream().sorted((x,y)->x.age-y.age)
                .forEach(z->System.out.println(z.name));
    }
}