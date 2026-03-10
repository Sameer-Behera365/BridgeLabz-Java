package ioprogramming.designpatterns;

class AdapterOldPrinter {
    public void oldPrint() {
        System.out.println("Old Print");
    }
}

interface AdapterNewPrinter {
    void print();
}

class PrinterAdapter implements AdapterNewPrinter {
    private AdapterOldPrinter oldPrinter = new AdapterOldPrinter();
    public void print() {
        oldPrinter.oldPrint();
    }
}

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AdapterNewPrinter printer = new PrinterAdapter();
        printer.print();
    }
}