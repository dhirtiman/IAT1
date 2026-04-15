// Q16 write a java program to implement the concept of importing classes from user defined package and creating packages.

import mypackage.Calculator;

/*
import foldername.ClassName;

call the ClassName.methodName to demonstrate the concept of importing classes from user defined package and creating packages.
*/


public class Main {
   public static void main (String args[]) {
	Calculator calc = new Calculator();
	System.out.println("Addition: " + calc.add(10,5));
	System.out.println("Multiplication: " + calc.multiply(10,5));
   }
}


/*
output: 
javac .\mypackage\Calculator.java
javac .\Main.java
java Main

Addition: 15
Multiplication: 50


*/
