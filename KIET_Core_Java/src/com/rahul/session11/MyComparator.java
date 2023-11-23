package com.rahul.session11;

import java.util.Comparator;

import com.rahul.session03.Circle;

public class MyComparator implements Comparator<Circle> {

	@Override
	public int compare(Circle o1, Circle o2) {
		// TODO Auto-generated method stub
		return -o1.getRadius()+o2.getRadius();
	}

}
