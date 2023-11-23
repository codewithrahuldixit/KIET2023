package com.rahul.session13;

public class Drawing {
	private Circle circle;

	public Drawing(Circle circle) {
		super();
		this.circle = circle;
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	@Override
	public String toString() {
		return "Drawing [circle=" + circle + "]";
	}
public void draw() {
	System.out.println("Drawing classs is Drawing "+circle);
}
}
