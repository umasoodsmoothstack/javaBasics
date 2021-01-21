// Day One Java basics package
package com.ss.basics.dayone;

/**
 * @author Usman Masood
 * Day One assigment of SmoothStack Java Basics - Print patterns
 */
public class PrintPattern {

	public static void main(String[] args) {
		// Right triangle 
		for (int i = 0 ; i <= 5; i++) {
			for (int j = 0; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		
		System.out.println();
		
		// Inverted right  triangle
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Pyramid
		int rows = 5;
		
		for (int i = 1; i <= rows; i++) {
			for (int j = rows - i; j >0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < i * 2; k ++) {
				System.out.print("*");				
			}
			System.out.println();
		} 
		
		System.out.println();
		
		// inverted pyramid
	    int invRows = 5;
		for(int i=invRows;i>=1;i--)
	     {
	         for(int j = i;j < invRows; j++) { 
	            System.out.print(" ");
	         }
	         for(int k = 1; k <= (2*i-1); k++) {
	            System.out.print("*");
	         }
	       System.out.println("");
	     } 
	 }
		
		

	}

