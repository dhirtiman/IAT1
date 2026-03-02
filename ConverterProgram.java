// 1 Write a program to convert a given Decimal number to Binary , Octal and Hexadecimal using recursive functions
import java .io.*;
import java.util.Scanner;


class Coverter {

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
	char hexChar(remainder<10)?(char)(remainder+'0'):(char)(remainder-10+'A');
	returntoHexaDecimal(n/16)+hexChar;
   }

}



public class ConverterProgram{

	public static void main(String[] args){
	   Converter cnv = new Converter();
           Scanner sc = new Scanner(System.in);
	   system.out.print("Enter a decimal Number: ");
	   int decimal = sc.nextInt();
	   int bin = cnv.toBinary(decimal);
	   int oct = cnv.toOctal(decimal);
	   String hex = cnv.toHexaDecimal(decimal);

	   System.out.println("\nBinary: "+bin);
	   System.out.println("Octal: "+oct);
	   System.out.println("HexaDecimal: "+hex);  				
	}
}



	 
	 



	