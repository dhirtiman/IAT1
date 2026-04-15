// 9. Write a JAVA program to demonstrate static member data 
// and static member methods Static variables and Methods:


/*
create a class with static variable integer , static unchanged String and
a static method to display the varible integer
also create a normal method to display all the static and non static data members

in the constructor of the class increment the static integer variable

create 3 objects of the class 
call the normal method for each object 
call the static method once to display the static integer varible 

here the static keywor was used for 
1. static variable Counter ( this is local to the class and shared by all the objects , it is incremented
each time the constructor is called)
2. static varibale college ( this is same for all ojects and is unchanged))
3. static method showTotalStudents() (this method be called directly using the class name without creating an object)
*/

public class Student_1 {
    static int Counter = 0; // Shared by all
    String studentName;
    static String college = "Krupanidhi College of Management"; // Static variable

    Student_1(String name) {
        studentName = name;
        Counter++;
    }

    // Static method - utility function
    static void showTotalStudents() {
        System.out.println("Total MCA students: " + Counter);
    }

    void display() {
        System.out.println(" Student: " + studentName
                + " College Name: " + college
                + " ,Total: " + Counter);
    }

    public static void main(String[] args) {
        // Static method call - NO object needed
        showTotalStudents();

        Student_1 s1 = new Student_1("Priya");
        Student_1 s2 = new Student_1("Rahul");
        Student_1 s3 = new Student_1("Anita");

        s1.display(); // Total: 3
        s2.display(); // Total: 3 (shared!)
        s3.display(); // Total: 3 (shared!)
        showTotalStudents();

        // Direct class access
        System.out.println("Total: " + Student_1.Counter);
    }
}

/*
 * Total MCA students: 0
 * Student: Priya College Name: Krupanidhi College of Management ,Total: 3
 * Student: Rahul College Name: Krupanidhi College of Management ,Total: 3
 * Student: Anita College Name: Krupanidhi College of Management ,Total: 3
 * Total MCA students: 3
 * Total: 3
 */