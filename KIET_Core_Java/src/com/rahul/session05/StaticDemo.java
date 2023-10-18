package com.rahul.session05;
class A{
	int x;//member | Instance Variable variable 
	static int y;
}
public class StaticDemo {
	//int z ;
public static void main(String[] args) {
	//Cannot make a static reference to 
	//the non-static field z
	//System.out.println(z);
	System.out.println(A.y);
}
}
