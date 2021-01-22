/**
 * 
 */
package com.ss.basics.daytwo;

/**
 * @author Usman Masood
 * Smoothstack Java basics day two - interaces
 */
public class Circle implements Shape {
	
	// Class attributes
	double area = 0;
	double diameter;
	
	// Construct instance
	public Circle(double side) {
		diameter = side;
	}

	public static void main(String[] args) {
		
		//create instance
		Circle circleOne = new Circle(5);
		
		// test methods
		circleOne.calculateArea();
		circleOne.display();
	}

	@Override
	public void calculateArea() {
		// calculate area of circle
		area = 3.14 * diameter;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The area of the circle is " + area);
	}

}
