package com.example.rahul.SpringFrameworkApp1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.rahul.SpringFrameworkApp1.drawingApp.Circle;
import com.example.rahul.SpringFrameworkApp1.drawingApp.Drawing;
import com.example.rahul.SpringFrameworkApp1.drawingApp.DrawingConfig;

//@SpringBootApplication
public class SpringFrameworkApp1Application {

	public static void main(String[] args) {
		//SpringApplication.run(SpringFrameworkApp1Application.class, args);
		var context = new AnnotationConfigApplicationContext(DrawingConfig.class);
		Circle c = context.getBean(Circle.class);
		//Injecting Circle Bean Into Drawing
		Drawing d1 = new Drawing(c);
		d1.draw();
	}

}
