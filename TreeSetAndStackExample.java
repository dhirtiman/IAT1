// 17. write a program to create object for Tree Set and Stack and use all methods.

import java.util.*;

public class TreeSetAndStackExample {
   public static void main(String args[]) {
	TreeSet<Integer> treeSet = new TreeSet<Integer>();

	treeSet.add(10);
	treeSet.add(20);
	treeSet.add(5);
	treeSet.add(15);
	treeSet.add(10); // duplicate
	treeSet.addAll(Arrays.asList(10,20,5,15,10));
	System.out.println("TreeSet Elements (sorted and unique): "+treeSet);


	System.out.println("First Element "+treeSet.first());
	System.out.println("Last Element "+treeSet.last());
	System.out.println("Higher than 10 "+treeSet.higher(10));
	System.out.println("Lower than 10 "+treeSet.lower(10));
	
	treeSet.remove(15);
	System.out.println("After Removing 15: "+treeSet);

	//Stack

	Stack<String> stack = new Stack<>();
	stack.push("Apple");
	stack.push("Banana");
	stack.push("Cherry");
	stack.push("Orange");


	System.out.println("Stack Elements (LIFO) order: "+stack);


	System.out.println("Top Element (peek): "+stack.peek());
	System.out.println("Popped Element: "+stack.pop());
	System.out.println("Stack after pop: "+stack);
	System.out.println("is Stack Empty? "+stack.isEmpty());


	System.out.println("Position of Banana in stack: "+stack.search("Banana"));


	System.out.println("\nFinal TreeSet:"+treeSet);
	System.out.println("Final Stack: "+stack);
   }
}


/*
javac .\TreeSetAndStackExample.java
java TreeSetAndStackExample

TreeSet Elements (sorted and unique): [5, 10, 15, 20]
First Element 5
Last Element 20
Higher than 10 15
Lower than 10 5
After Removing 15: [5, 10, 20]
Stack Elements (LIFO) order: [Apple, Banana, Cherry, Orange]
Top Element (peek): Orange
Popped Element: Orange
Stack after pop: [Apple, Banana, Cherry]
is Stack Empty? false
Position of Banana in stack: 2

Final TreeSet:[5, 10, 20]
Final Stack: [Apple, Banana, Cherry]

*/










