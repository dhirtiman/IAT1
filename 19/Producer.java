/*
implement Runnable interface 
have the SharedBuffer object as data member
constructor to initialize the buffer

overide run method:
inside try block:
 loop i from 1 to 10:
  call buffer.produce(i);
  sleep for 500 miliseconds using Thread.sleep(500)
catch block:
  catch InterruptedException and call 
    Thread.currentThread().interrupt() to restore the interrupted status of the thread


*/

public class Producer implements Runnable {
	private SharedBuffer buffer;

	public Producer(SharedBuffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				buffer.produce(i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

	}
}