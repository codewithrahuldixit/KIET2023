package com.example.rahul.SpringFrameworkApp1.drawingApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Drawing {

	@Autowired
	@Qualifier("square")
	private Shape shape;

	public Drawing(Shape shape) {
		super();
		this.shape = shape;
	}
	public Shape getShape() {
		return shape;
	}

	//@Autowired
	public void setShape(Shape shape) {
		System.out.println("Setter Injection done");
		this.shape = shape;
	}

	public void draw() {
		System.out.println("Drawing classs is Drawing " + shape);
	}
}
