package com.rahul.session05;

public class PolyDemo {
 
	public static void sum(int x ,int y) {
		System.out.println("The Sum of Two Integer :"+(x+y));
	}
	public static void sum(int x ,int y,int z) {
		System.out.println("The Sum of Three Integer :"+(x+y+z));
	}
	public static void sum(String x ,String y) {
		System.out.println("The Concatnation of two string  :"+x+y);
	}
	public static void main(String[] args) {
			sum(4,5);
			sum("Rahul ","Dixit");
			sum(4,5,6);
			//The method sum(int, int) in the type PolyDemo 
			//is not applicable for the arguments (double, double)
			//sum(4.5,5.6);

	}

}
