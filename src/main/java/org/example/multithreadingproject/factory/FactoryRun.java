package org.example.multithreadingproject.factory;

public class FactoryRun {
    public static void main(String[] args) {
        FactoryPat factoryPat = new FactoryPat();
        Payment payment = factoryPat.getPayment("Credit");
        payment.pay(100);

    }
}
