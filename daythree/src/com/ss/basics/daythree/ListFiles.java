package com.ss.basics.daythree;

import java.io.File;
import java.io.IOException;
public class ListFiles {
	
	public static void listOfFiles(File dirPath){
		// Save file in array
		File filesList[] = dirPath.listFiles();
      
		// For loop on each item in array 
      for(File file : filesList) {
         if(file.isFile()) {
            System.out.println(file.getName());
         } else {
        	 // Run the method on each nested folder
        	 listOfFiles(file);
         }
      }
   }
   
	public static void main(String args[]) throws IOException {
      //Creating a File object for directory
      File file = new File("D:\\ExampleDirectory");
      //List of all files and directories
      listOfFiles(file);
   }
}