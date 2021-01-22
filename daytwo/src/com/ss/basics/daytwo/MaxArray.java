/**
 * 
 */
package com.ss.basics.daytwo;

import java.util.Random;

/**
 * @author Usman Mmasoood
 * Smoothstack Java Basics Day two Calculate a max array
 */
public class MaxArray {

	public static void main(String[] args) {
		
		// Add number generator
		Random rand = new Random();
		
		//create a 5x5 array
		int[][] array = new int[5][5];
		
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				array[i][j] = rand.nextInt(20);
				
				//print array 
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
		
		// Declare max number and row/column values
		int max = array[0][0];
		int row = 0;
		int col = 0;
		
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(max < array[i][j]) {
					max = array[i][j];
					row = i + 1; 
					col = j + 1;
				}
			}
		}
		System.out.println("The maxmimum number is " + max);
		System.out.println("The number is at row " + row + " and column " + col);

			
	}

}
