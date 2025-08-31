package org.example.multithreadingproject.thread;

public class AccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Thread restoran = new Thread(() -> bankAccount.pulcixarma("Restoran", 600));
        Thread kafe = new Thread(() -> bankAccount.pulcixarma("Kafe", 600));
        restoran.start();
        kafe.start();
        Thread thread = new Thread(() -> bankAccount.pulcixarma("Thread", 600));
        thread.start();


    }
}
