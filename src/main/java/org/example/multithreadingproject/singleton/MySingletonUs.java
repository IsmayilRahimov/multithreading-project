package org.example.multithreadingproject.singleton;

public class MySingletonUs {
    private static MySingletonUs instance;

    private MySingletonUs() {
    }

    public static MySingletonUs getInstance() {
        if (instance == null) {
            instance = new MySingletonUs();
        }
        return instance;
    }

    public void showmessage() {
        System.out.println("MySingletonUs");
    }

}
