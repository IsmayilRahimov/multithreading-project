package org.example.multithreadingproject.thread;

public class MyProject {
    public static void main(String[] args) {
        MyThread azerisiq = new MyThread();
        azerisiq.start();
        MyThread azerqaz = new MyThread();
        azerqaz.start();
        MyThread azersu = new MyThread();
        azersu.start();
    }
}
