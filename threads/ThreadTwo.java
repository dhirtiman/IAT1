
// File: ThreadTwo.java
public class ThreadTwo extends Thread {

    ThreadTwo(String name) {
        setName(name);
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(getName() + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread Two interrupted");
            }
        }
    }
}
