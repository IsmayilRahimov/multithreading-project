package org.example.multithreadingproject.singleton;

public class MySingletonPattern {
    private static MySingletonPattern instance;

    private MySingletonPattern() {
    }

    public static MySingletonPattern getInstance() {
        if (instance == null) {
            instance = new MySingletonPattern();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("MySingletonPattern");
    }
}
