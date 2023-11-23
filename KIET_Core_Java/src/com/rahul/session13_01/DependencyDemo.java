package com.rahul.session13_01;

public class DependencyDemo {
public static void main(String[] args) {
	Rectangle shape = new Rectangle(12,13);
	//Circle shape = new Circle(12);
	//Shape shape
	Drawing drawing = new Drawing(shape);
	drawing.draw();
}
}
