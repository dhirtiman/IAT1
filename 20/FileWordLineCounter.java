// q20 Write a program to get file name at runtime and display number of lines and words in that file.

import java.io.*;

import java.util.Scanner;

/*
1. accept a file name with path from the user: Scanner -> String fileName
2. initialize lineCount and wordCount = 0
3. create a BufferedReader object with FileReader(fileName)
4. repeat until  line = reader.readLine() is not null // which means we have not reached the end of the file
    a. increment lineCount
	b. store stuff inside array of Strings words
	   stuff = line.trim().split("\\s+") // this means we remove leading trailing spaces 
	   and split the line into words based on one or more white space characters
	     "\\s+" : \\s matches any whitespace charcter( space, tab, newLine)
		           + means one or more occrences of \\s
	c. add the words.len to the wordCount
5. print the lineCount and wordCount
6. close the reader 
7. handle FileNotFound and IOException using chain of catch blocks
8. close the Scanner
*/

public class FileWordLineCounter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter filename (with path if needed): ");
		String fileName = sc.nextLine();

		int lineCount = 0, wordCount = 0;
		String line;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));

			while ((line = reader.readLine()) != null) {
				lineCount++;
				String[] words = line.trim().split("\\s+");
				wordCount += words.length;
			}

			System.out.println("\nFile Analysis Results:" +
					"\nNumber of lines: " + lineCount
					+ "\nNumber of words: " + wordCount);
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: File" + fileName + " not found!");
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		sc.close();
	}
}
