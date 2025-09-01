package org.example.multithreadingproject.factory;

public class Credit implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Credit borucunuz  " + amount + " azn mebleginde odendi: ");
    }

}
