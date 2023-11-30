package com.example.rahul.SpringFrameworkApp1.drawingApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DrawingConfig {

	@Bean
	public Circle getCircle() {
		return new Circle(23);
	}
	@Bean
	@Primary
	public Rectangle getRectangle() {
		return new Rectangle();
	}
	@Bean
	//Circle Injection is By Using Parameters
	public Drawing getDrawing(Shape shape) {
		return new Drawing(shape);
	}
}








