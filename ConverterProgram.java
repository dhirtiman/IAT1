
// 1 Write a program to convert a given Decimal number to Binary , Octal and Hexadecimal using recursive functions
import java.util.Scanner;

public class ConverterProgram {
	static int toBinary(int n) {

		if (n == 0) // if n is 0 then 0 is returned
			return 0;

		return (n % 2 + 10 * toBinary(n / 2)); // if n is not zero , eg: n = 10 , then return
		// remainder of n%2,10%2 = 0,   0 + 10*toBinary(n/2) ->  0+10*(5%2) ->  0+10*1 +10*0 -> 10
		// n = 10 , n%2 = 0   
		// n = 5 , n %2 = 1
		// n = 2 , n%2 = 0
		// n = 1 , n%2 = 1
		// n = 0 , 0 

		// 1010
		//1010 = 1*1000+1*10
	}

	static int toOctal(int n) {
		if (n == 0)
			return 0;
		return (n % 8 + 10 * toOctal(n / 8));
		// n = 10 , n%8 = 2
		// n = 1 , n%8 = 1
		// n = 0 

		// 2+10*1+10*0 =   2+10+0 = 12
	}

	static String toHexaDecimal(int n) {
		if (n == 0)
			return "";
		int remainder = n % 16;
		char hexChar = (remainder < 10) ? (char) (remainder + '0') : (char) (remainder - 10 + 'A');
		return toHexaDecimal(n / 16) + hexChar;

		// n = 10 , rem = 10 , hex = 10-10+'A' = 'A'
		// n = n/16 = 0 ,  return ''

		// ''+'A'
		// A
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner is created 
		System.out.print("Enter a decimal Number: "); // prompt asking for input
		int decimal = sc.nextInt(); // input is stored in decimal variable
		int bin = toBinary(decimal); // result of toBinary is stored in bin variable
		int oct = toOctal(decimal);
		String hex = toHexaDecimal(decimal);

		System.out.println("\nBinary: " + bin);
		System.out.println("Octal: " + oct);
		System.out.println("HexaDecimal: " + hex);
		sc.close();
	}
}
