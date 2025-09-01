package org.example.multithreadingproject.strategy;

public class Azersu implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Azersu " + amount + " azn mebleginde odendi: ");
    }
}
