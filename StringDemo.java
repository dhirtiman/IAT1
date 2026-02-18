// 12. ,  14	Write a JAVA program to demonstrate String class and its methods.

public class StringDemo {

        public static void main(String[] args) {

                System.out.println("JAVA STRING CLASS METHODS DEMONSTRATION\n");

                // 1. String Creation (Literal vs new)
                String s1 = "Hello"; // String Pool
                String s2 = new String("Hello"); // Heap Memory
                String s3 = "Hello";

                System.out.println("1. STRING CREATION:");
                System.out.println("s1: " + s1);
                System.out.println("s2: " + s2);
                System.out.println("s1 == s3: " + (s1 == s3)); // true (same reference)
                System.out.println("s1.equals(s3): " + s1.equals(s3)); // true

                System.out.println();

                // 2. Basic String Information
                System.out.println("2. STRING INFORMATION:" +
                                "\nLength: " + s1.length() +
                                "\nIs Empty: " + s1.isEmpty() +
                                "\nCase comparison: " + s1.equalsIgnoreCase("HELLO") +
                                "\nCompareTo: " + s1.compareTo("World"));
                System.out.println();

                // 3. Character Access Methods
                System.out.println("3. CHARACTER ACCESS:"
                                + "\nChar at index 1: " + s1.charAt(1)
                                + "\nIndex of 'l': " + s1.indexOf('l')
                                + "\nLast index of 'l': " + s1.lastIndexOf('l')
                                + "\nSubstring(1,4): " + s1.substring(1, 4)
                                + "\n");

                // 4. Case Conversion
                System.out.println("4. CASE CONVERSION:"
                                + "\ntoUpperCase: " + s1.toUpperCase()
                                + "\ntoLowerCase: " + s1.toLowerCase()
                                + "\n");

                // 5. Trimming
                System.out.println("5. TRIMMING:");
                String s4 = "  Hello World  ";
                System.out.println("Original: '" + s4 + "'"
                                + "\nTrimmed: '" + s4.trim() + "'");

                System.out.println();

                // 6. String Replacement
                System.out.println("6. REPLACEMENT:");
                String s5 = "Java Programming";
                System.out.println("Replace 'a' with 'A': " + s5.replace('a', 'A') +
                                "\nReplace 'Pro' with 'Core': " + s5.replace("Pro", "Core"));

                System.out.println();

                // 7. String Splitting
                System.out.println("7. SPLITTING:");
                String s6 = "apple,banana,orange,grape";
                String[] fruits = s6.split(",");

                System.out.print("Fruits: ");
                for (String fruit : fruits) {
                        System.out.print(fruit.trim() + " ");
                }
                System.out.println();

                System.out.println();

                // 8. Searching Methods
                System.out.println("8. SEARCHING:");
                String s7 = "Welcome to Java Programming";

                System.out.println("Contains 'Java': " + s7.contains("Java") +
                                "\nStarts with 'Welcome': " + s7.startsWith("Welcome") +
                                "\nEnds with 'Programming': " + s7.endsWith("Programming") + "\n");

                // 9. String Concatenation
                System.out.println("9. CONCATENATION:");
                String s8 = "Hello";

                System.out.println("Concat ' World': " + s8.concat(" World")
                                + "Using + operator: " + (s8 + " World!") + "\n");

                // 10. StringBuilder (Mutable String)
                System.out.println("10. STRINGBUILDER (MUTABLE):");

                StringBuilder sb = new StringBuilder("Java");

                sb.append(" Programming");
                sb.reverse();
                sb.insert(2, "Core");

                System.out.println("StringBuilder result: " + sb.toString());

                System.out.println();

                // 11. String Formatting
                System.out.println("11. FORMATTING:");

                String name = "Alice";
                int age = 25;
                double salary = 50000.50;

                System.out.printf("Name: %s, Age: %d, Salary: %.2f%n",
                                name, age, salary);

                System.out.println();

                // 12. Immutability Demonstration
                System.out.println("12. IMMUTABILITY:");

                String original = "Hello World";
                String modified = original.replace("World", "Java");

                System.out.println("Original unchanged: '" + original + "'" +
                                "\nNew string: '" + modified + "'");
        }
}

/*
 * JAVA STRING CLASS METHODS DEMONSTRATION
 * 
 * 1. STRING CREATION:
 * s1: Hello
 * s2: Hello
 * s1 == s3: true
 * s1.equals(s3): true
 * 
 * 2. STRING INFORMATION:
 * Length: 5
 * Is Empty: false
 * Case comparison: true
 * CompareTo: -15
 * 
 * 3. CHARACTER ACCESS:
 * Char at index 1: e
 * Index of 'l': 2
 * Last index of 'l': 3
 * Substring(1,4): ell
 * 
 * 4. CASE CONVERSION:
 * toUpperCase: HELLO
 * toLowerCase: hello
 * 
 * 5. TRIMMING:
 * Original: ' Hello World '
 * Trimmed: 'Hello World'
 * 
 * 6. REPLACEMENT:
 * Replace 'a' with 'A': JAvA ProgrAmming
 * Replace 'Pro' with 'Core': Java Coregramming
 * 
 * 7. SPLITTING:
 * Fruits: apple banana orange grape
 * 
 * 8. SEARCHING:
 * Contains 'Java': true
 * Starts with 'Welcome': true
 * Ends with 'Programming': true
 * 
 * 9. CONCATENATION:
 * Concat ' World': Hello World
 * Using + operator: Hello World!
 * 
 * 10. STRINGBUILDER (MUTABLE):
 * StringBuilder result: gnCoreimmargorP avaJ
 * 
 * 11. FORMATTING:
 * Name: Alice, Age: 25, Salary: 50000.50
 * 
 * 12. IMMUTABILITY:
 * Original unchanged: 'Hello World'
 * New string: 'Hello Java'
 * 
 */