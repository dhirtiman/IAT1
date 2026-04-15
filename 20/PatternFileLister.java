// q21 Write a program to list files in the current working directory depending upon a given pattern

import java.io.*;

import java.util.Scanner;

/*
accept a pattern from user eg, *.java, *
replace * with .* to convert it into  regex pattern
create a File Object for current directory using File dir = new File(".")

create a File array to hold result of this method
dir.listFiles(new FilenameFilter() interface with accept method to check if file name matches the pattern) 
  override boolean accept method which takes 
   File dir and String name of the file as parameters
    inside return True if 
	 name.matches(pattern)
	 else return false

 if the array is not null and has lenght > 0 : which means there are files matching the pattern 
  print the file names using for each loop on the array
  if it .isDirectory() print [DIR] suffix 
  else print the file size in bytes ,  file.getLength()
 else:
  print no files matched the pattern 
*/


public class PatternFileLister {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file pattern(eg.,'java','Test'):");
		String pattern = (sc.nextLine()).replace("*", ".*");

		File currentDir = new File(".");

		File[] matchingFiles = currentDir.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.matches(pattern);
			}
		});

		if (matchingFiles != null && matchingFiles.length > 0) {
			System.out.println("\nFiles matching pattern " + pattern + ":");
			for (File file : matchingFiles) {
				System.out.println(file.getName() + (file.isDirectory() ? " [DIR]" : " (" + file.length() + "bytes)"));
			}
		} else {
			System.out.println("No files match the pattern '" + pattern + "'");
		}
		sc.close();
	}
}