import java.util.ArrayList;
import java.util.List;

public class SharedBuffer {
  private List<Integer> buffer = new ArrayList<>();
  private final int CAPACITY = 5;

  public void produce(int item) throws InterruptedException {
	synchronized (this ) { 
	   while(buffer.size() == CAPACITY ) {
		System.out.println("Buffer full. Producer waiting..");
		wait();
	   }
	buffer.add(item);
	System.out.println("Produced "+item+"(size: "+buffer.size()+")");
	notifyAll();
  	}
  }

public int consume() throws InterruptedException {
  synchronized(this) {
	while(buffer.isEmpty()) {
	   System.out.println("Buffer Empty. Consumer waiting..");
	   wait();
 	}
	int item = buffer.remove(0);
	
	System.out.println("Consumed: "+item+"(size: "+buffer.size()+")");
	notifyAll();
	return item;
  }
}
}	