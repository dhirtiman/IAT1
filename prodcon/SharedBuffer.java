package prodcon;

// 19.	Write a JAVA program using synchronized threads, which demonstrates producer consumer concept.

// File: SharedBuffer.java

import java.util.ArrayList;
import java.util.List;

public class SharedBuffer {

    private List<Integer> buffer = new ArrayList<>();
    private final int CAPACITY = 5;

    public void produce(int item) throws InterruptedException {

        synchronized (this) {

            while (buffer.size() == CAPACITY) {

                System.out.println("Buffer full. Producer waiting...");
                wait(); // Release lock and wait
            }

            buffer.add(item);

            System.out.println(
                    "Produced: " + item + " (Size: " + buffer.size() + ")");

            notifyAll(); // Notify waiting consumer
        }
    }

    public int consume() throws InterruptedException {

        synchronized (this) {

            while (buffer.isEmpty()) {

                System.out.println("Buffer empty. Consumer waiting...");
                wait();
            }

            int item = buffer.remove(0);

            System.out.println(
                    "Consumed: " + item + " (Size: " + buffer.size() + ")");

            notifyAll(); // Notify waiting producer

            return item;
        }
    }
}
