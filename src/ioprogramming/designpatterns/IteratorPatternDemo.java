package ioprogramming.designpatterns;

import java.util.Iterator;
import java.util.NoSuchElementException;

class NameRepository implements Iterable<String> {
    private String[] names = {"A", "B", "C"};

    public Iterator<String> iterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {
        int index;

        public boolean hasNext() {
            return index < names.length;
        }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            return names[index++];
        }
    }
}

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository repo = new NameRepository();
        for (String name : repo) {
            System.out.println(name);
        }
    }
}