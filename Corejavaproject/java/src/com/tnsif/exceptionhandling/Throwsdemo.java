package com.tnsif.exceptionhandling;

import java.io.FileReader;
import java.io.IOException;

public class Throwsdemo {
	


	// demo for throws keyword
	
	static void test() throws IOException,ClassNotFoundException{
	        FileReader file=new FileReader("abc.txt");//may throw io exception
	        Class.forName("Test");
	        
	        file.close();
	}
	public static void main(String[] args) {
	        try {
	                Throwsdemo.test();
	        }
	        catch(IOException e) {
	                System.out.println("file error");
	        }
	        catch(ClassNotFoundException f) {
	                System.out.println("class not found");
	        }
	}
	
}
