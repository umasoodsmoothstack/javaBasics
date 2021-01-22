/**
 * 
 */
package com.ss.basics.daytwo;

/**
 * @author Usman Masood
 * Smoothstack day 2 - interfaces
 */
public class Triangle implements Shape {
	
	double area;
	double base;
	double height;
	
	public Triangle (double sideOne, double sideTwo) {
		base = sideOne;
		height = sideTwo;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangleOne = new Triangle(2, 3);
		
		triangleOne.calculateArea();
		triangleOne.display();
	}

	@Override
	public void calculateArea() {
		// calculate triangle area
		area = (base * height) / 2;
	}

	@Override
	public void display() {
		// display the area
		System.out.println("The area is " + area);
	}

}
