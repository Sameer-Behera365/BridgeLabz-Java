package ioprogramming.designpatterns;

class SingletonLogger {
    private static final SingletonLogger instance = new SingletonLogger();
    private SingletonLogger() {}
    public static SingletonLogger getInstance() { return instance; }
    public void log(String message) { System.out.println(message); }
}

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingletonLogger l1 = SingletonLogger.getInstance();
        SingletonLogger l2 = SingletonLogger.getInstance();
        l1.log("Singleton Works");
        System.out.println(l1 == l2);
    }
}