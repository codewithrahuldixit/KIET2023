package com.rahul.session11;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>(5);
		a1.add(55);
		a1.add(52);
		a1.add(53);
		a1.add(11);
		a1.add(44);
		a1.add(2);
		a1.add(3);
		System.out.println(a1.indexOf(11));
		System.out.println(a1.contains(55));
		System.out.println(a1.isEmpty());
		
	}

}
