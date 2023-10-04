package com.rahul.session03;

public class CircleDemo {
public static void main(String[] args) {
	//The constructor Circle(int) is undefined
	Circle c =new Circle(15);
	//The field Circle.radius is not visible
	//c.radius=10;
	//c.setRadius(10);
	c.area();
}
}
