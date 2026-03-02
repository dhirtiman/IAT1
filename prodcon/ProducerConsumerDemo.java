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

/*
Produced: 0 (Size: 1)
Consumed: 0 (Size: 0)
Produced: 1 (Size: 1)
Produced: 2 (Size: 2)
Consumed: 1 (Size: 1)
Produced: 3 (Size: 2)
Produced: 4 (Size: 3)
Consumed: 2 (Size: 2)
Produced: 5 (Size: 3)
Produced: 6 (Size: 4)
Produced: 7 (Size: 5)
Consumed: 3 (Size: 4)
Produced: 8 (Size: 5)
Buffer full. Producer waiting...
Consumed: 4 (Size: 4)
Produced: 9 (Size: 5)
Consumed: 5 (Size: 4)
Consumed: 6 (Size: 3)
Consumed: 7 (Size: 2)
Consumed: 8 (Size: 1)
Consumed: 9 (Size: 0)

*/
