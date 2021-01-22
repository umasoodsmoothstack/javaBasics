/**
 * 
 */
package com.ss.basics.daytwo;

/**
 * @author Usman Masood
 * Smoothstack Java Basics Day Two - Array Input
 */

import java.util.Scanner;  

public class ArrayInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int size;
		int sum = 0;
		boolean entering = true;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of elements you want to store: ");
		
		//reading number of elements for array
		size = input.nextInt();
		
		// create array
		int[] array = new int[size];
		
		// enter int elements
		System.out.println("Enter the int elements: ");
		
		// catch errors and fill out the array
		
		try {
			for (int i = 0; i < size; i++) {
				array[i] = input.nextInt();
				entering = false;
			}
		} catch (Exception e) {
			System.out.println("There is an error. Did you enter an integer?");
		} 
	
			
		for (int i = 0; i < size; i++) {
				sum += array[i];
		}
	
		
		System.out.println("The sum of elements is: " + sum);

	}

}
