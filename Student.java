// write a program to explain the concept of constructor overloading

public class Student {

	int id;
	String name;
	int age;

	Student() {
		id = 0;
		name = "Not Assigned";
		age = 0;
	}

	Student(int i, String n) {
		id = i;
		name = n;
		age = 0;
	}

	Student(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("-----------");
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(101, "Anita");
		Student s3 = new Student(102, "Rahul", 22);

		s1.display();
		s2.display();
		s3.display();
	}
}

/*
 * -----------
 * ID: 101
 * Name: Anita
 * Age: 0
 * -----------
 * ID: 102
 * Name: Rahul
 * Age: 22
 * -----------
 */
