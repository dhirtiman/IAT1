package threads;

// File: MultiThreadDemo.java
public class MultiThreadDemo {

    public static void main(String[] args) {

        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        t1.start(); // Starts ThreadOne
        t2.start(); // Starts ThreadTwo concurrently

        // Main thread continues
        System.out.println("Main thread finished");
    }
}
