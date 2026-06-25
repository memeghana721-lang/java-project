package com.tnsif.multithreding;

public class TextendsThread {
	

	public class T extends Thread{
	        
	Example e;// variable
	T(Example e){  // cons
	        this.e=e;
	}
	public void run() {
	        e.display();
	}
	}
	

}
