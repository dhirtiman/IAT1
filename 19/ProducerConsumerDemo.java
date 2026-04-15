
/*

create SharedBuffer object
create producer and consumer threads , using Thread constructor andd Runable classes(pass the buffer in each constructor) , pass the name too
start both threads



*/

public class ProducerConsumerDemo{
	public static void main(String[] args) {
	  SharedBuffer buffer = new SharedBuffer();
	  Thread producer = new Thread(new Producer(buffer),"Producer");
	  Thread consumer = new Thread(new Consumer(buffer),"Consumer");
	  producer.start();
	  consumer.start();
	}
}