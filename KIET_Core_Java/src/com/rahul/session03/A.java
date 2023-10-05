package com.rahul.session03;

public class A {
private int x;
public A(){
	System.out.println("No-Arg Construcotor Invoked ");
	x=0;
}
public A(int x){
	//x=12;
	//Constructor call must be the first statement in a constructor
	this();//this must be the first statement of the block
	System.out.println("Parameterized Construcotor Invoked ");
	this.x=x;
}
public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

}
