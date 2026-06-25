package com.tnsif.multithreding;



public class SynchronizationDemo {

    public static void main(String[] args) {

        Example e = new Example();

        MyThread t1 = new MyThread(e);
        MyThread t2 = new MyThread(e);

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}