// 13. ,  15	Program to demonstrate Lambda Expression with Collection (Sorting)


import java.util.*;

// Student Class
class Student {

    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return name + " (" + marks + " marks)";
    }
}


/*
here we have to demonstrate lambda expressions with collection sorting , 
first import java.util.* for using List,ArrayList,Arrays and Comparator

create a student class with data members String and int 
constructor and getters and overridde toString() method for formatted object representation

create a List<String> object intialize it with Arrays.asList(strings...)
print it before
sort it using lambda exp like list.sort((obj1,obj2) -> obj1.compareTo(obj2)) for asc
then print it 
sort it using obj2.compareTo(obj1) for desc the print it

similarly create Integer list add elements sort asc and dsc using lambda and print

create List<Student>  add student objects by using .add(constructor call)
print it before sorting 
descibe the lambda exp likewise:
asc by naame : list.sort((obj1,obj2) -> obj1.getName().compareTo(obj2.getName()))
desc by marks: list.sort((obj1,obj2) -> Integer.compare(obj2.getMarks(), obj1.getMarks()))
print the sorted lists

demonstrate Comparator

by
member asc: list.sort(Comparator.comparing(ClassName::getterForDataMember))
name asc: students.sort(Comparator.comparing(Student::getName));
marks asc: students.sort(Comparator.comparing(Student::getMarks));

marks desc + name asc:
students.sort(Comparator.comparing(Student::getMarks).reversed().thenComparing(Student::getName))
print the lists for each case

demo stream api sorting 
declare a List<Student> 
initialize it with: 
student.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).toList();
print the sorted list

*/

public class LambdaSortingDemo {

    public static void main(String[] args) {

        System.out.println("LAMBDA EXPRESSION WITH COLLECTION SORTING\n");

        // 1. SORTING ARRAYLIST OF STRINGS
        System.out.println("1. SORTING STRINGS (Ascending):");

        List<String> fruits = new ArrayList<>(
                Arrays.asList("banana", "apple", "cherry", "date"));

        System.out.println("Before: " + fruits);

        // Lambda Expression for sorting (Ascending)
        fruits.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("After Ascending: " + fruits);

        // Reverse sorting (Descending)
        fruits.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("After Descending: " + fruits);

        System.out.println();

        // 2. SORTING INTEGERS
        System.out.println("2. SORTING INTEGERS:");

        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(50, 10, 90, 30, 70));

        System.out.println("Before: " + numbers);

        numbers.sort((n1, n2) -> n1.compareTo(n2));
        System.out.println("Sorted Ascending: " + numbers);

        System.out.println();

        // 3. CUSTOM OBJECT SORTING (Student Class)
        System.out.println("3. CUSTOM OBJECT SORTING:");

        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 92));
        students.add(new Student("Charlie", 78));
        students.add(new Student("Diana", 92));

        System.out.println("Before (Unsorted):");
        students.forEach(s -> System.out.println(s));

        // Sort by NAME (Ascending)
        students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));

        System.out.println("\nSorted by NAME:");
        students.forEach(s -> System.out.println(s));

        // Sort by MARKS (Descending)
        students.sort(
                (s1, s2) -> Integer.compare(s2.getMarks(), s1.getMarks()));

        System.out.println("\nSorted by MARKS (Descending):");
        students.forEach(s -> System.out.println(s));

        System.out.println();

        // 4. USING Comparator.comparing() (Java 8+)
        System.out.println("4. Comparator.comparing():");

        students.sort(Comparator.comparing(Student::getName));

        System.out.println("Sorted by Name (Method Reference):");
        students.forEach(System.out::println);

        // Sort by marks then name
        students.sort(
                Comparator.comparing(Student::getMarks)
                        .reversed()
                        .thenComparing(Student::getName));

        System.out.println("\nMarks Desc + Name Asc:");
        students.forEach(System.out::println);

        System.out.println();

        // 5. STREAM API SORTING
        System.out.println("5. STREAM SORTING:");

        List<Student> sortedStudents = students.stream()
                .sorted(Comparator.comparing(Student::getMarks).reversed())
                .toList();

        System.out.println("Stream Sorted:");
        sortedStudents.forEach(s -> System.out.println(s));
    }
}


/*
LAMBDA EXPRESSION WITH COLLECTION SORTING

1. SORTING STRINGS (Ascending):
Before: [banana, apple, cherry, date]
After Ascending: [apple, banana, cherry, date]
After Descending: [date, cherry, banana, apple]

2. SORTING INTEGERS:
Before: [50, 10, 90, 30, 70]
Sorted Ascending: [10, 30, 50, 70, 90]

3. CUSTOM OBJECT SORTING:
Before (Unsorted):
Alice (85 marks)
Bob (92 marks)
Charlie (78 marks)
Diana (92 marks)

Sorted by NAME:
Alice (85 marks)
Bob (92 marks)
Charlie (78 marks)
Diana (92 marks)

Sorted by MARKS (Descending):
Bob (92 marks)
Diana (92 marks)
Alice (85 marks)
Charlie (78 marks)

4. Comparator.comparing():
Sorted by Name (Method Reference):
Alice (85 marks)
Bob (92 marks)
Charlie (78 marks)
Diana (92 marks)

Marks Desc + Name Asc:
Bob (92 marks)
Diana (92 marks)
Alice (85 marks)
Charlie (78 marks)

5. STREAM SORTING:
Stream Sorted:
Bob (92 marks)
Diana (92 marks)
Alice (85 marks)
Charlie (78 marks)
*/