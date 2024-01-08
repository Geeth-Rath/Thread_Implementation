package org.example;

public class Main {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
//        t1.run();
        t1.start();


        Thread2 t2 = new Thread2();
        Thread tt2 = new Thread(t2);
        tt2.start();

    }
}