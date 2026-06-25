package com.tnsif.multithreding;

// Demo for extending Thread class

class Eclipse extends Thread {
    public void run() {
        System.out.println("Eclipse Thread ID: " + Thread.currentThread().getId());
    }
}

class Onenote extends Thread {
    public void run() {
        System.out.println("Onenote Thread ID: " + Thread.currentThread().getId());
    }
}

class Chrome extends Thread {
    public void run() {
        System.out.println("Chrome Thread ID: " + Thread.currentThread().getId());
    }
}

public class ExtendingThread {

    public static void main(String[] args) {

        Eclipse e = new Eclipse();
        e.start();

        Onenote o = new Onenote();
        o.start();

        Chrome c = new Chrome();
        c.start();

        System.out.println("Main Thread ID: " + Thread.currentThread().getId());
    }
}