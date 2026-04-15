/*
implement Runnable
have SharedBuffer datamember
constructor to initialize the buffer
override run method:
try block:
 loop 10 times:
   call buffer.consume()
   Tread.sleep(1200) to simulate time taken to consume an item
catch block:
 catch InterruptedException and call 
	Thread.currentThread().interrupt() to restore the interrupted status of the thread
*/

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
				Thread.sleep(1500);
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}