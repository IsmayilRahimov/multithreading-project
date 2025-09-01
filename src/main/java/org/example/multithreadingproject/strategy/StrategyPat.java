package org.example.multithreadingproject.strategy;

public class StrategyPat implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("StrategyPat " + amount + " azn mebleginde odendi: ");
    }

}
