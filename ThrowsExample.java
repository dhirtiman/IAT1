//q15 write a java prograam to implement the concept of exception handling by creating user-defined exceptions

import java.io.*;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
	   super(message);
	}
}


class ThrowsExample{


	static  void checkAge(int age)  throws InvalidAgeException {
		if(age<18) {
		   throw new InvalidAgeException("Age must be 18 or above!");
		}
		System.out.println("Valid age: "+age);
	}

	public static void main(String args[]) {
		try {
		     checkAge(18);
		     checkAge(21);
		} catch (InvalidAgeException e) {
		     System.out.println("Error: "+e.getMessage());
		}
		System.out.println("Program continues...");
			
	}
}

/*
output:

Error: Age must be 18 or above!
Program continues...
*/