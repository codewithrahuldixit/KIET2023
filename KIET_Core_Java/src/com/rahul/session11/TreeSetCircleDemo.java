package com.rahul.session11;

import java.util.TreeSet;

import com.rahul.session03.Circle;

public class TreeSetCircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Circle> t1 = new TreeSet<Circle>(new MyComparator());
		t1.add(new Circle(5));
		t1.add(new Circle(6));
		t1.add(new Circle(2));
		System.out.println(t1);
		

	}

}
