package com.ss.basics.weekone;

import java.util.ArrayList;


public class AssignOneLambda {

	public static void main(String[] args) {
		PerformOperation isOdd = (a) -> {
			if (a % 2 == 0) {
				return "Even";
			} else {
				return "odd";
			}
		};
		
		PerformOperation isPrime = (a) -> {
			if (a == 1) {
				return "Prime";
			} else {
				for (int i = 2; i < a; i++) {
					if (a % i == 0) {
						return "Composite";
					}
				}
				return "Prime";
			}  
		};
		
		PerformOperation isPalindrome = (a) -> {
			String word = "" + a;
			for(int i = 0; i<(int)word.length()/2; i++) {
				if(word.charAt(i) != word.charAt(word.length()-1-i)) {
					return "Not a palindrome";
				}
			}
			return "Is a palindrome";
		};
	
		
	}

interface PerformOperation {
	String check(int a);
}}
