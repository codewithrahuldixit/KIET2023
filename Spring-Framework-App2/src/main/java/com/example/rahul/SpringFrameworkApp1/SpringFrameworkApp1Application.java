package com.example.rahul.SpringFrameworkApp1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.rahul.SpringFrameworkApp1.drawingApp.Circle;
import com.example.rahul.SpringFrameworkApp1.drawingApp.Drawing;
import com.example.rahul.SpringFrameworkApp1.drawingApp.Rectangle;
import com.example.rahul.SpringFrameworkApp1.drawingApp.Shape;


//@SpringBootApplication
@Configuration
@ComponentScan("com.example.rahul.SpringFrameworkApp1.drawingApp")
public class SpringFrameworkApp1Application {

	
	public static void main(String[] args) {
		//SpringApplication.run(SpringFrameworkApp1Application.class, args);
		var context = new AnnotationConfigApplicationContext(SpringFrameworkApp1Application.class);
		//Circle c = context.getBean(Circle.class);
		//Injecting Circle Bean Into Drawing
		Drawing d1 = context.getBean(Drawing.class);
		d1.draw();
	}

}
