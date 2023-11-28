package com.example.rahul.SpringFrameworkApp1.drawingApp;

public class Drawing {
	private Shape shape;
	
public Drawing(Shape shape) {
		super();
		this.shape = shape;
	}

public void draw() {
	System.out.println("Drawing classs is Drawing "+shape);
}
}
