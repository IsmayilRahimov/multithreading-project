package org.example.multithreadingproject.thread;

public class BankAccount {
    private int balance = 1000;

    public synchronized void pulcixarma(String threadName, int amount) {
        if (balance >= amount) {
            System.out.println(threadName + " emeliyyati ishe dushdu :");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            balance -= amount;
            System.out.println(threadName + " emeliyyati bitdi . yeni balance: " + balance);
        } else {
            System.out.println("Balans kifayet etmir: " + balance);
            System.out.println("Yeni balance: " + balance);
        }
    }

}


