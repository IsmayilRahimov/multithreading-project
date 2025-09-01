package org.example.multithreadingproject.singleton;

public class PatternUsage {
    private static PatternUsage instance;

    private PatternUsage() {
    }

    public static PatternUsage getInstance() {
        if (instance == null) {
            instance = new PatternUsage();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("PatternUsage");
    }
}
