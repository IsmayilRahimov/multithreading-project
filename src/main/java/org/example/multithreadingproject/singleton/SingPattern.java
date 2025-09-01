package org.example.multithreadingproject.singleton;

public class SingPattern {
    private static SingPattern instance;

    private SingPattern() {
    }

    public static SingPattern getInstance() {
        if (instance == null) {
            instance = new SingPattern();
        }
        return instance;
    }

    public void doSomethings() {
        System.out.println("SingPattern");
    }
}
