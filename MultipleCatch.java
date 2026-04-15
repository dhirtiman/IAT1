// Write a program to implement Exception handling in Java

import java.lang.Exception;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.NumberFormatException;


/*
import java.lang.* ( as it is an exam paper , i will import it) 
inside a try block
1. define an array of strings with a lenghth
2. try to assign a typecasted value of an element from the array of index out of the length 
3. catch the ArrayIndexOutOfBoundsException 
4. catch the NumberFormatException 
5 catch the general Expception

for each exception catch block print exception.getMessage()
*/

class MultipleCatch{
	public static void main(String args[]) {	
	   try{
		String[] arr = {"1","2","A"};
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