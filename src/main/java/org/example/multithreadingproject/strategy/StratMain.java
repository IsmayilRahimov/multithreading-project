package org.example.multithreadingproject.strategy;

public class StratMain {
    public static void main(String[] args) {
        Payment payment = new StrategyPat();
        payment.pay(100);
        payment.pay(150);
        payment = new Azersu();
        payment.pay(200);
        payment.pay(250);
    }
}
