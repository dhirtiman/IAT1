// q20 Write a program to get file name at runtime and display number of lines and words in that file.

import java.io.*;

import java.util.Scanner;

public class FileWordLineCounter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter filename (with path if needed): ");
		String fileName = sc.nextLine();

		int lineCount = 0, wordCount = 0;
		String line;

		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			while ((line = reader.readLine()) != null) {
				lineCount++;
				String[] words = line.trim().split("\\s+");
				wordCount += words.length;
			}

			System.out.println("\nFile Analysis Results:" +
					"\nNumber of lines: " + lineCount
					+ "\nNumber of words: " + wordCount);
		} catch (FileNotFoundException e) {
			System.out.println("Error: File" + fileName + " not found!");
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		sc.close();
	}
}
