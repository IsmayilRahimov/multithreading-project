package org.example.multithreadingproject.singleton;

public class SingMain {
    public static void main(String[] args) {
        SingPattern singPattern = SingPattern.getInstance();
        singPattern.doSomethings();
        MySingletonUs mySingletonUs = MySingletonUs.getInstance();
        mySingletonUs.showmessage();
        PatternUsage patternUsage = PatternUsage.getInstance();
        patternUsage.doSomething();
        MySingletonPattern mySingletonPattern = MySingletonPattern.getInstance();
        mySingletonPattern.doSomething();

        PatSingMy patsingmy = PatSingMy.getINstance();
        patsingmy.showWrite();
        PatSingMy patsingmy1 = PatSingMy.getINstance();
        patsingmy1.showWrite();

    }
}
