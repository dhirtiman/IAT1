// File: MultiThreadDemo.java


/*

create two MyThread objects with differerent names

start both using .start() 
observe the interleaving of output from both threads and the main thread


*/

public class MultiThreadDemo {

    public static void main(String[] args) {

        MyThread t1 = new MyThread("Thread One");
        MyThread t2 = new MyThread("Thread Two");

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