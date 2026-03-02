// create a calculator class with methods for basic arithmetic operations


public class CalculatorDemo{
	public static void main(String[] args){
	   Calculator calc = new Calculator();
	   System.out.println("Addition (int): "+calc.add(10,20));
	   System.out.println("Addition (int 3 args): "+calc.add(10,20,30));
	   System.out.println("Addition (double): "+calc.add(10.5,20.5));
	
	
	   System.out.println("Subtraction: "+calc.subtract(50,25));

	   System.out.println("Multiplication (2 args) : "+calc.multiply(5,6));
	   System.out.println("Multiplication (3 args) : "+calc.multiply(2,3,4));	
	   
	   System.out.println("Division: "+calc.divide(20.0,4.0));
	}
}

class Calculator {
	public int add(int a,int b) {
	   return a+b;
	}
	public int add(int a,int b,int c) {
	   return a+b+c;
	}
	public double add(double a,double b) {
	   return a+b;
	}
	public int subtract(int a,int b) {
	   return a-b;
	}
	public int multiply(int a,int b) {
	   return a*b;
	}
	public int multiply(int a,int b,int c) {
	   return a*b*c;
	}
	
	public double divide(double a,double b) {
	   if(b!=0)
		return a/b;
	   return 0.0;
	}
}



	 
	 



	