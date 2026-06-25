package com.tnsif.multithreding;

public class Tsych {

    public static void main(String[] args) {

        Example e = new Example();

        T t1 = new T(e);
        T t2 = new T(e);
        T t3 = new T(e);

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}

	


