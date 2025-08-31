package org.example.multithreadingproject.thread;
//interfaceden implement olur//

/*

 */
public class MyRunnable implements Runnable {
    @Override
    public synchronized void run() {
        System.out.println("Odenish olundu: ");
    }
}
