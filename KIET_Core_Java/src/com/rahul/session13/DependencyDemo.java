package com.rahul.session13;

public class DependencyDemo {
public static void main(String[] args) {
	Circle shape = new Circle(12);
	Drawing drawing = new Drawing(shape);
	drawing.draw();
}
}
