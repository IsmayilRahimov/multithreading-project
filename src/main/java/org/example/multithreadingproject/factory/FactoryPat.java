package org.example.multithreadingproject.factory;

public class FactoryPat {
    public Payment getPayment(String type) {
        if (type.equalsIgnoreCase("AzerSu")) {
           return new AzerSu();
        }else if (type.equalsIgnoreCase("Credit")) {
            return new Credit();
        }
        return null;

    }

}
