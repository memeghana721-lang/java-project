package com.tnsif.multithreding;

class T extends Thread {

    Example e;

    T(Example e) {
        this.e = e;
    }

    @Override
    public void run() {
        e.display();
    }
}
