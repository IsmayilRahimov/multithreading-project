package org.example.multithreadingproject.factory;

public class AzerSu implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("AzerSu borcunuz " + amount + " azn mebleginde odendi: ");
    }
}
