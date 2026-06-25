package com.tnsif.constructorprogram;

public class Student1 {
	int id;
	String name;

	Student1(int id,String name ){
	        this.id=id;
	        this.name=name;
	}

	void display() {
	        System.out.println("ID :"+id);
	        System.out.println("Name :"+name);
	}
	public static void main(String[] args) {
	        Student1 s=new Student1(101,"surya");
	        Student1 s1=new Student1(103,"yurya");
	        //boolean output=s1.(instanceof)Student();
	        s.display();
	        s1.display();
	}
	}
	


