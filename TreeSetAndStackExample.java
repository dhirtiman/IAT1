// 17. Write a program to create object for Tree Set and Stack and use all methods. 

import java.util.*;

public class TreeSetAndStackExample {

    public static void main(String[] args) {

        // TreeSet Example
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        treeSet.addAll(Arrays.asList(10,20,5,15,10));
        // treeSet.add(10);
        // treeSet.add(20);
        // treeSet.add(5);
        // treeSet.add(15);
        // treeSet.add(10); // Duplicate, will not be added

        System.out.println("TreeSet Elements (Sorted and Unique): " + treeSet);

        // TreeSet Methods
        System.out.println("First Element: " + treeSet.first() +
                "\nLast Element: " + treeSet.last() +
                "\nHigher than 10: " + treeSet.higher(10) +
                "\nLower than 10: " + treeSet.lower(10));

        treeSet.remove(15);
        System.out.println("After Removing 15: " + treeSet);

        // Stack Example
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("orange");

        System.out.println("\nStack Elements (LIFO Order): " + stack);

        // Stack Methods
        System.out.println("Top Element (Peek): " + stack.peek()
                + "\nPopped Element: " + stack.pop()
                + "\nStack After Pop: " + stack
                + "\nIs Stack Empty? " + stack.isEmpty()

                // Searching in Stack
                + "\nPosition of Banana in Stack: " + stack.search("Banana")

                // Final Output
                + "\n\nFinal TreeSet: " + treeSet
                + "\nFinal Stack: " + stack);
    }
}


/*

TreeSet Elements (Sorted and Unique): [5, 10, 15, 20]
First Element: 5
Last Element: 20
Higher than 10: 15
Lower than 10: 5
After Removing 15: [5, 10, 20]

Stack Elements (LIFO Order): [Apple, Banana, Cherry, orange]
Top Element (Peek): orange
Popped Element: orange
Stack After Pop: [Apple, Banana, Cherry]
Is Stack Empty? false
Position of Banana in Stack: 2

Final TreeSet: [5, 10, 20]
Final Stack: [Apple, Banana, Cherry]

*/