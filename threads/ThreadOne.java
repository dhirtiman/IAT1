// File: ThreadOne.java
public class ThreadOne extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Thread One: " + i);

            try {
                Thread.sleep(500); // Simulate work
            } 
            catch (InterruptedException e) {
                System.out.println("Thread One interrupted");
            }
        }
    }
}
