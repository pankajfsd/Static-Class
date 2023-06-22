package com.simplefinalclass;

public class App {

	public static void main(String[] args) {
		Circle circle = new Circle(5.0);
		System.out.println("Radius: " + circle.getRadius());
		System.out.println("Area: " + circle.calculateArea());
	}

}
