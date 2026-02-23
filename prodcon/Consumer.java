package prodcon;

// 19.	Write a JAVA program using synchronized threads, which demonstrates producer consumer concept.


// File: Consumer.java

public class Consumer implements Runnable {

    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {

        try {

            for (int i = 0; i < 10; i++) {

                buffer.consume();

                Thread.sleep(2000); // Simulate consumption delay
            }

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();
        }
    }
}
