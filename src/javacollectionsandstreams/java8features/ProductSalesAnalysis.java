package javacollectionsandstreams.java8features;

import java.util.*;

class Sale {
    int pid, qty; double price;
    Sale(int p,int q,double pr){pid=p;qty=q;price=pr;}
}

class ProductSales {
    int pid; double revenue;
    ProductSales(int p,double r){pid=p;revenue=r;}
    public String toString(){return pid+" "+revenue;}
}

public class ProductSalesAnalysis {
    public static void main(String[] args) {
        List<Sale> list = List.of(
                new Sale(1,12,100),
                new Sale(2,20,50),
                new Sale(3,5,200)
        );

        list.stream()
                .filter(s->s.qty>10)
                .map(s->new ProductSales(s.pid,s.qty*s.price))
                .sorted((a,b)->Double.compare(b.revenue,a.revenue))
                .limit(5)
                .forEach(System.out::println);
    }
}