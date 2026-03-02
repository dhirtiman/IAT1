public class MultiThreadDemo{
   public static void main(String args[]) {
 	ThreadOne t1 = new ThreadOne();
 	ThreadTwo t2 = new ThreadTwo();

	t1.start();
 	t2.start();

	
	System.out.println("Main thread finished");
   }
}


/*

javac .\ThreadOne.java
javac .\ThreadTwo.java
javac .\MultiThreadDemo.java

java MultiThreadDemo


Main thread finished
Thread Two: 1
Thread One: 1
Thread One: 2
Thread Two: 2
Thread One: 3
Thread Two: 3
Thread One: 4
Thread Two: 4
Thread One: 5
Thread Two: 5
*/