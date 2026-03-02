public class Producer implements Runnable {
  private SharedBuffer buffer;
  public Producer(SharedBuffer buffer) {
	this.buffer = buffer;
  }
  @Override
  public void run() {
	int item = 0;
	try{ 
	   for(int i=0;i<10;i++){
		buffer.produce(item++);
		Thread.sleep(500);
	   }
	} catch(InterruptedException e) {
		Thread.currentThread().interrupt();
	}
	
   }
}