/* Smoothstack day 3 - 
* @author Usman Masood
* Create a Java class that appends text to an existing file
*/
package com.ss.basics.daythree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//

public class AppendText {
	
	public static void write(String s, File f) throws IOException {
		
		// Create the Filewriter
		FileWriter fw = new FileWriter(f, true);
		
		//Write string on a new line
		fw.write("\n"+s);
		fw.close();
	}

   
	public static void main(String args[]) {
		try {

			// Set the file then use the method
			File f = new File("C:\\Users\\umaso\\Desktop\\text.txt");
			write("this is a test", f);
		} catch (IOException e) {
			e.printStackTrace();
		}
   }
}