package com.ss.basics.daythree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LetterCounter {

	public static void main(String[] args) throws FileNotFoundException {
		
		// declare variables
		String fileName;
		char letter;
		char[] array = null;
		int count = 0;
		
		// scanner for input
		Scanner charInput = new Scanner(System.in);
		
		// Receive character
		System.out.println("What letter would you like to search for?");
		letter = charInput.next().charAt(0);
		charInput.close();
		
		// get files
		fileName = "C:\\Users\\umaso\\Desktop\\test.txt";
		
		// Save to file
		File file = new File(fileName);
		
		// File Scanner
		Scanner inputFile = new Scanner(file);
		
		// loop to save characters to array
		while (inputFile.hasNext()) {
            String answer = inputFile.nextLine();
            answer = answer.toLowerCase();
            char[] characters = answer.toCharArray();
            
            array = characters;
            
		}
				
		inputFile.close();
		
		// iterate through array for count
		for (int i = 0; i < array.length; i++ ) {
			if (array[i] == letter) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	

}
