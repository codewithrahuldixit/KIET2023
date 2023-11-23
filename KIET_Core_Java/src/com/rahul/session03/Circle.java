package com.rahul.session03;

public class Circle implements Comparable<Circle>{
 int radius;
//No Arg
 public Circle(){
	radius=5;
}
//Parameterized 
public Circle (int r){
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
@Override
public String toString() {
	return "Circle [radius=" + radius + "]";
}
@Override
public int compareTo(Circle o) {
	// TODO Auto-generated method stub
	
	return this.radius-o.radius;
	
}

}
