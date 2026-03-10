package ioprogramming.designpatterns;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String news);
}

interface Subject {
    void register(Observer observer);
    void notifyObservers();
}

class NewsAgency implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String news;

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(news);
        }
    }
}

class NewsChannel implements Observer {
    private String name;

    public NewsChannel(String name) {
        this.name = name;
    }

    public void update(String news) {
        System.out.println(name + " received: " + news);
    }
}

public class ObserverPatternDemo {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        agency.register(new NewsChannel("Channel1"));
        agency.setNews("Breaking News");
    }
}