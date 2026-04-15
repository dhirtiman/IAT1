import java.util.ArrayList;
import java.util.List;

/*
create a class 
define data members 
ArrayList<Integet> and int capacity 

define two methods:
produce( int item):
	inside synchronized block
	 while(ArrayList.size() == capacity)
	   print "buffer full, producer waiting.."
	   call wait()
	add item to ArrayList
	print that item was produced and current size of the buffer
	call notifyAll() // to wake up consumer threads

consume():



*/


public class SharedBuffer {
	private List<Integer> buffer = new ArrayList<>();
	private final int CAPACITY = 5;

	public void produce(int item) throws InterruptedException {
		synchronized (this) {
			while (buffer.size() == CAPACITY) {
				System.out.println("Buffer full. Producer waiting..");
				wait();
			}
			buffer.add(item);
			System.out.println("Produced " + item + "(size: " + buffer.size() + ")");
			notifyAll();
		}
	}

/*
consume() method: 
inside synchronized block
 check if buffer is empty, if yes print "buffer is empty , consumer waiting"
 call wait()
else:
 store the first item of the buffer in a variable
 call notifyAll() to wake up producer threads
 print that the item was consumed and return the item

 */


	public int consume() throws InterruptedException {
		synchronized (this) {
			while (buffer.isEmpty()) {
				System.out.println("Buffer Empty. Consumer waiting..");
				wait();
			}
			int item = buffer.remove(0);

			System.out.println("Consumed: " + item + "(size: " + buffer.size() + ")");
			notifyAll();
			return item;
		}
	}
}