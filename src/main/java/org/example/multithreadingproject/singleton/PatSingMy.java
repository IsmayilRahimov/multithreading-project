package org.example.multithreadingproject.singleton;

public class PatSingMy {
    private static PatSingMy instance;


    private PatSingMy() {
    }

    public static PatSingMy getINstance() {
        if (instance == null) {
            instance = new PatSingMy();

        }
        return instance;
    }

    public void showWrite() {
        System.out.println("PatSingMy runn");
    }
}
