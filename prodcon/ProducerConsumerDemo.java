package prodcon;

// 19.	Write a JAVA program using synchronized threads, which demonstrates producer consumer concept.



// File: ProducerConsumerDemo.java

public class ProducerConsumerDemo {

    public static void main(String[] args) {

        SharedBuffer buffer = new SharedBuffer();

        Thread producer = new Thread(new Producer(buffer), "Producer");
        Thread consumer = new Thread(new Consumer(buffer), "Consumer");

        producer.start();
        consumer.start();
    }
}
