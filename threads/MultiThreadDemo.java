

// File: MultiThreadDemo.java
public class MultiThreadDemo {

    public static void main(String[] args) {

        ThreadTwo t1 = new ThreadTwo("Thread One");
        ThreadTwo t2 = new ThreadTwo("Thread Two");

        t1.start(); // Starts ThreadOne
        t2.start(); // Starts ThreadTwo concurrently

        // Main thread continues
        System.out.println("Main thread finished");
    }
}

/*
javac .\ThreadOne.java      
javac .\ThreadTwo.java 
javac .\MultiThreadDemo.java 
java MultiThreadDemo        

Main thread finished
Thread One: 1
Thread Two: 1
Thread Two: 2
Thread One: 2
Thread Two: 3
Thread One: 3
Thread Two: 4
Thread One: 4
Thread Two: 5
Thread One: 5

*/