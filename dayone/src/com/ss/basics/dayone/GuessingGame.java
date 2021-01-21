package com.ss.basics.dayone;

//Random and input libraries
import java.util.Random;
import java.util.Scanner;

/**
* @author Usman Masood
* Guess a number between 1 and 100
*/
public class GuessingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Variables needed 
		Random rand = new Random();
		int numToGuess = rand.nextInt(100); // Generate a number
		int numTries = 0; // Store number off tries
		Scanner input = new Scanner(System.in); // Get input
		int guess; // Store Guess
		boolean win = false; // Win State
		
		// Run the loop while the win state is false
		while (win == false) {
		
			System.out.println("Guess a number between 1 and 100");
			guess = input.nextInt(); // User inputs number
			numTries++; // Add one try
			
			// Guess 
			if (guess - numToGuess <= 10 && guess - numToGuess >= -10) {
				System.out.println("Congratulations, the number is " + numToGuess);
				win = true;
			} else {
				System.out.println("Keep trying.");
				if (numTries > 5) {
					System.out.println("Sorry, the number is " + numToGuess);
					System.exit(1);
				}
			}
		}
		
		System.exit(1);
	}

}
