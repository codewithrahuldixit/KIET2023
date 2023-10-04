package com.rahul.session03;

public class Circle {
 int radius;
//No Arg
 Circle(){
	radius=5;
}
//Parameterized 
private Circle (int r){
	radius=r;
}
public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}

public void area() {
	System.out.println("The area of the circle is "+3.14*radius*radius);
}
}
