package com.rahul.session03;

public class InheritanceDemo {
public static void main(String[] args) {
	
	B b1 = new B();
	b1.setX(10);
	b1.setY(20);
	//The final local variable b1 cannot be assigned. 
	//It must be blank and not using a compound assignment
	//b1=null;
	System.out.println(b1.getX());
	System.out.println(b1.getY());
}
}
