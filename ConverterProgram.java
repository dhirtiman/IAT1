// 1 Write a program to convert a given Decimal number to Binary , Octal and Hexadecimal using recursive functions
import java.util.Scanner;


class Converter {

   static int toBinary(int n) {
	if(n==0)
	   return 0;
	return(n%2+10*toBinary(n/2));
   }
   static int toOctal(int n) {
	if(n==0)
	   return 0;
	return(n%8+10*toOctal(n/8));
   }
   static String toHexaDecimal(int n) {
	if(n==0)
	   return "";
	int remainder = n%16;
	char hexChar = (remainder<10)?(char)(remainder+'0'):(char)(remainder-10+'A');
	return toHexaDecimal(n/16)+hexChar;
   }

}



public class ConverterProgram{

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	   System.out.print("Enter a decimal Number: ");
	   int decimal = sc.nextInt();
	   int bin = Converter.toBinary(decimal);
	   int oct = Converter.toOctal(decimal);
	   String hex = Converter.toHexaDecimal(decimal);

	   System.out.println("\nBinary: "+bin);
	   System.out.println("Octal: "+oct);
	   System.out.println("HexaDecimal: "+hex);  	

	 				
	}
}



	 
	 
/*
Enter a decimal Number: 69

Binary: 1000101
Octal: 105
HexaDecimal: 45

*/


	