package com.tnsif.multithreding;

public class MyThread extends Thread {

    Example e;

    MyThread(Example e) {
        this.e = e;
    }

    public void run() {
        e.display();
    }
}