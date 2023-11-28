package com.example.rahul.SpringFrameworkApp1.drawingApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DrawingConfig {

	@Bean
	public Circle getCircle() {
		return new Circle(23);
	}
	@Bean
	public Rectangle getRectangle() {
		return new Rectangle();
	}
}
