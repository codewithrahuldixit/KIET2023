package com.rahul.session09;

import java.util.Scanner;

import com.rahul.session03.Circle;

public class ArrayDemo {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Circle c[] = new Circle[4];
		create(c);
		printArray(c);
	}

	private static void printArray(Circle[] c) {
		for(var x : c) {
			System.out.println(x);
		}		
	}

	private static void create(Circle[] c) {
		for(int i =0 ;i<c.length;i++) {
			System.out.println("Please Enter the radius");
			c[i]= new Circle(sc.nextInt());
		}
		
	}
}
