public class Consumer implements Runnable {
  private SharedBuffer buffer;
  public Consumer(SharedBuffer buffer) {
	this.buffer = buffer;
  }
  @Override
  public void run() {
	try{ 
	   for(int i=0;i<10;i++){
		buffer.consume();
		Thread.sleep(1500);
	   }
	} catch(InterruptedException e) {
		Thread.currentThread().interrupt();
	}
   }
}