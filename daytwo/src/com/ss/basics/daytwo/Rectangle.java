/**
 * 
 */
package com.ss.basics.daytwo;

/**
 * @author Usman Masood
 * Smoothstack day two interfaces
 */
public class Rectangle implements Shape {
	
	// Rectangle attributes
	double area;
	double length;
	double width;
	
	// constructor
	public Rectangle (double sideOne, double sideTwo) {
		length = sideOne;
		width = sideTwo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangleOne = new Rectangle(2, 3);
		
		rectangleOne.calculateArea();
		rectangleOne.display();
	}

	@Override
	public void calculateArea() {
		// calculate rectangle area
		area = length * width;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The area of the rectangle is " + area);
	}

}
