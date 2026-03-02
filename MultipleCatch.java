// Write a program to implement Exception handling in Java

import java.io.*;

class MultipleCatch{
	public static void main(String args[]) {	
	   try{
		String[] arr = {"1","2","3"};
		int num = Integer.parseInt(arr[3]);	
	   }
	   catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index error: "+e.getMessage());
	   }
	   catch(NumberFormatException e){
    	   	System.out.println("Number format error"+e.getMessage());
	   }
	   catch(Exception e){
    	   	System.out.println("General error "+e);
	   } 
	}
}

/*
output:

Array index error: Index 3 out of bounds for length 3
*/