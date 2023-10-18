package com.rahul.session05;
class Parent{
	public void show() {
		System.out.println("The Parent Show i Invoked");
	}
}
class Child extends Parent{
	public void show() {
		System.out.println("The Child Show i Invoked");
	}
	public void demo() {
		System.out.println("The Child demo i Invoked");
	}
	
}
public class RuntimePolyDemo {
public static void main(String[] args) {
	//Child c1 = new Child();
	//c1.show();
	Parent p1 = new Child();
	p1.show();
	p1.demo();
}
}
