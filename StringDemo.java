
/*
demonstrate various String class methods,
1. creation of String using lieral and new keyword , print both 
2. String comparison using == , .equals() ,.equalsIgnoreCase(), .compareTo() (returns 0 or +ve or -ve number)
3. show string information using .length(), isEmpty()
4. character acess using .charAt(index), lastIndexOf(String), substring(start,end)
5. case conversion using toUpperCase(),toLowerCase()
6. create a string with leadding and trailing whitespaces
 print it , print it after using str.trim()
 7. String replacement using 
 .replace(oldChar,newChar) , .replace(oldString,newString) 
 8. String splitting: create an array of strings  using , .split(regex) 
 9. Searching in string using .contains(String) , .startsWith(String)
 .endsWith(suffix)
 10. String concatenation using prefix.concat(suffix) , str + str2
 11. StringBuilder demo: 
 create a StringBuilder object 
 append some text to it (.append(string))
 reverse it (.reverse())
 insert a string at a specific index using .insert(index,string)
 this shows the mutability of StringBuilder
 12. formatting 
 create few variables String , int , double 
 print using System.out.printf() 
 with format specifiers
 %s String
 %d int
 %.2f double(2 decimal places)
 
 13. Immutability demo:

 create a string
 perform a replacement using .replace() method store the result 

 print the string and the result
 to see that the string is unchanged and new String is created with the changes

 
 
*/


class StringDemo {

	public static void main(String args[]) {
		System.out.println("Java String Class methods demonstration");

		// String creation (Literal vs new)
		String s1 = "Hello";

		String s2 = new String("Hello");
		String s3 = "Hello";
		System.out.println("1. String creation:");

		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s1 == s3: " + (s1 == s3));
		System.out.println("s1.equals(s3): " + s1.equals(s3));

		System.out.println();

		// Basic String information
		System.out.println("1. String Information:");
		System.out.println("Lenght: " + s1.length());
		System.out.println("Is Empty: " + s1.isEmpty());
		System.out.println("Case comparison: " + s1.equalsIgnoreCase("Hello"));
		System.out.println("Compare to: " + s1.compareTo("World:")); // Negative

		System.out.println("");
		// 3. Character Access Methods
		System.out.println("Char at index 1: " + s1.charAt(1));
		System.out.println("Index of 'l': " + s1.lastIndexOf("l"));
		System.out.println("Substring(1,4): " + s1.substring(1, 4));
		System.out.println("");

		// 4. Case Conversion

		System.out.println("4.  Case Conversion");
		System.out.println("toUpperCase: " + s1.toUpperCase());
		System.out.println("toLowerCase: " + s1.toLowerCase());
		System.out.println("");

		// 5. Trimming and Padding
		System.out.println("5. Trimming");

		String s4 = " Hello World  ";

		System.out.println("Original: " + s4 + "");
		System.out.println("Trimmed: " + s4.trim() + "");
		System.out.println("");

		// 6. String replacement
		System.out.println("6. Replacement: ");
		String s5 = "Java Programming";

		System.out.println("Replace 'a' with 'A': " + s5.replace('a', 'A'));
		System.out.println("Replace 'Pro' with 'Core': " + s5.replace("Pro", "Core"));
		System.out.println("");

		// 7 String Splitting
		System.out.println("7. Splitting: ");

		String s6 = "apple,banana,orange,grape";
		String[] fruits = s6.split(",");
		System.out.println("Fruits: ");
		for (String fruit : fruits) {
			System.out.print(fruit.trim() + " ");
		}
		System.out.println("\n");

		// Searching methods

		System.out.println("8. Searching");
		String s7 = "Welcome to Java Programming";

		System.out.println("Contains 'Java': " + s7.contains("Java"));
		System.out.println("Starts with 'Welcome': " + s7.startsWith("Welcome"));
		System.out.println("Ends with 'Programming': " + s7.endsWith("Programming"));

		System.out.println("9. concatenation: ");
		String s8 = "Hello";
		System.out.println("Concat 'World':" + s8.concat(" World")
				+ "\nUsing + operator: " + (s8 + " World!") + "\n");

		System.out.println("10. StringBuilder (Mutable):");
		StringBuilder sb = new StringBuilder("Java");
		sb.append(" Programming");
		sb.reverse();
		sb.insert(2, "Core");

		System.out.println("StringBuilder result: " + sb.toString() + "\n");

		System.out.println("11. Formatting:");
		String name = "Alice";
		int age = 25;
		double salary = 50000.50;
		System.out.printf("\nName: %s,Age: %d,Salary: %.2f%n", name, age, salary);

		System.out.println("\n Immutability:");
		String original = "Hello World";
		String modified = original.replace("World", "Java");
		System.out.println("Original unchanged: '" + original + "'"
				+ "\nNew string: '" + modified + "'");

	}
}

/*
 * output:
 * Java String Class methods demonstration
 * 1. String creation:
 * s1: Hello
 * s2: Hello
 * s1 == s3: true
 * s1.equals(s3): true
 * 
 * 1. String Information:
 * Lenght: 5
 * Is Empty: false
 * Case comparison: true
 * Compare to: -15
 * 
 * Char at index 1: e
 * Index of 'l': 3
 * Substring(1,4): ell
 * 
 * 4. Case Conversion
 * toUpperCase: HELLO
 * toLowerCase: hello
 * 
 * 5. Trimming
 * Original: Hello World
 * Trimmed: Hello World
 * 
 * 6. Replacement:
 * Replace 'a' with 'A': JAvA ProgrAmming
 * Replace 'Pro' with 'Core': Java Coregramming
 * 
 * 7. Splitting:
 * Fruits:
 * apple banana orange grape
 * 
 * 8. Searching
 * Contains 'Java': true
 * Starts with 'Welcome': true
 * Ends with 'Programming': true
 * 9. concatenation:
 * Concat 'World':Hello World
 * Using + operator: Hello World!
 * 
 * 10. StringBuilder (Mutable):
 * StringBuilder result: gnCoreimmargorP avaJ
 * 
 * 11. Formatting:
 * 
 * Name: Alice,Age: 25,Salary: 50000.50
 * 
 * Immutability:
 * Original unchanged: 'Hello World'
 * New string: 'Hello Java'
 */