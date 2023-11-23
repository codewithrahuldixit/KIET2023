package com.rahul.session13_01;

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
