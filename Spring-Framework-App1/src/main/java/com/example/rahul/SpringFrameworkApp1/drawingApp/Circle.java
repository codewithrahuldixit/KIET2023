package com.example.rahul.SpringFrameworkApp1.drawingApp;

public class Circle implements Shape {
	private int radius;

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	

}
