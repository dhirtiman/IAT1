// create a calculator class with methods for basic arithmetic operations

import java.util.Scanner;

public class CalculatorDemo {
	public static void main(String[] args) {
		int a,b,c,ch;
		double ad,bd;
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();

		do {
			System.out.println("------------CALC-------------");
			System.out.println("1.Add");
			System.out.println("2.Subtract");
			System.out.println("3.Multiply");
			System.out.println("4.Divide");
			System.out.println("5.Exit");

			System.out.print("Enter a choice: ");
			ch = sc.nextInt();

			switch (ch) {
				case 1:
					System.out.println("Enter two numbers to add");
					a=sc.nextInt();
					b=sc.nextInt();
					System.out.println("a + b = "+calc.add(a, b));
					break;
				case 2:
					System.out.println("Enter two numbers to subtract");
					a=sc.nextInt();
					b=sc.nextInt();
					System.out.println("a - c =  "+calc.subtract(a, b));
					
					break;
				case 3:
					System.out.println("Enter two numbers to multiply");
					a=sc.nextInt();
					b=sc.nextInt();
					System.out.println("a x b =  "+calc.multiply(a, b));
					
					break;
				case 4:
					System.out.println("Enter two numbers to divide");
					ad=sc.nextDouble();
					bd=sc.nextDouble();
					System.out.println("Result: "+calc.divide(ad, bd));
					
					break;
				case 5:
					break;
				default:
					System.out.println("Invalid input");
					break;
			}

		}while(ch!=5);


	}
}

class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int multiply(int a, int b, int c) {
		return a * b * c;
	}

	public double divide(double a, double b) {
		if (b != 0)
			return a / b;
		return 0.0;
	}
}

/*
 * Addition (int): 30
 * Addition (int 3 args): 60
 * Addition (double): 31.0
 * Subtraction: 25
 * Multiplication (2 args) : 30
 * Multiplication (3 args) : 24
 * Division: 5.0
 * 
 */
