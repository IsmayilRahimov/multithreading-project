package org.example.multithreadingproject.thread;

public class MyThread extends Thread {
//    @Override
//    public void run() {
//        System.out.println("MyThread");
//    }

    @Override
    public synchronized void run() {
        System.out.println("Start");

    }





}
