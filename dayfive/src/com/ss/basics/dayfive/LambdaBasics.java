package com.ss.basics.dayfive;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaBasics {
	
	static List<String> str = Arrays.asList("this","is","a","list","of","every","word","randomly","aaa");
    static String[] array = {"this","is","a","list","of","every","word" };
	String longestString = null;
	static List<Integer> listInteger = List.of(1, 2, 3, 4, 5, 6);
		
	public static String getString(List<Integer> list) {
		return list.stream().map(i -> i % 2 == 0 ? "e" + i : "o" + i).collect(Collectors.joining(","));
	}

	public static void main(String[] args) {
		
		// Comparators
		Comparator<String> compByLength = (aName, bName) -> aName.length() - bName.length();
		Comparator<String> compAlpha = (aName, bName) -> aName.charAt(0) - bName.charAt(0);
		Comparator<String> compE = (aName, bName) ->  {
	        if (aName.contains("e") && bName.contains("e")) {
		          return 0;
		        } else if (aName.contains("e")) {
		          return -1;
		        } else {
		          return 1;
		        }
		      };
		    
		//Problem answers
		System.out.println("\n Ascending \n ===========");
		
		//Sorted by length
		str.stream().sorted(compByLength).forEach(System.out::println);
		
		System.out.println("\n Descending \n ===========");
		//Reversed sorted by langth
		str.stream().sorted(compByLength.reversed()).forEach(System.out::println);
		
		//Alphabetical order
		System.out.println("\n Alphabetical \n ===========");
		str.stream().sorted(compAlpha).forEach(System.out::println);
		
		//Letter e goes first
		System.out.println("\n Letter e \n ===========");
		str.stream().sorted(compE).forEach(System.out::println);

		//E without comparator
		System.out.println("\n Letter e without comparator \n ===========");
	    Arrays.sort(array, (aName, bName) -> {
	        if (aName.contains("e") && bName.contains("e")) {
	          return 0;
	        } else if (aName.contains("e")) {
	          return -1;
	        } else {
	          return 1;
	        }
	      });
	    
	    Arrays.asList(array).forEach(System.out::println);
	    
		System.out.println("\n Problem 2: \n ===========");
		System.out.println(getString(listInteger));
	    
	    //use of filter	
	    System.out.println( "\n Words that start with \"a\" \n ===========");
	    str.stream().sorted().filter((s) -> s.startsWith("a") && s.length() == 3).forEach(System.out::println);
	};

}
