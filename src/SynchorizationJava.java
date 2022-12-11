class Count{
	int count;
	public synchronized void increment() {
		count++;
	}
}

public class SynchorizationJava {

	public static void main(String[] args) throws InterruptedException {
      Count c = new Count();
      
      
      Thread t1 = new Thread(new Runnable() 
      {
		public void run() {
			for(int i = 1; i<=1000; i++) {
				c.increment();
			}
			
		}
      });
      
      Thread t2 = new Thread(new Runnable() 
      {
		public void run() {
			for(int i = 1; i<=1000; i++) {
				c.increment();
			}
			
		}
      });
      
      Thread t3 = new Thread(new Runnable() 
      {
		public void run() {
			for(int i = 1; i<=1000; i++) {
				c.increment();
			}
			
		}
      });
      
      Thread t4 = new Thread(new Runnable() 
      {
		public void run() {
			for(int i = 1; i<=1000; i++) {
				c.increment();
			}
			
		}
      });
      
      t1.start();
      t2.start();
      t3.start();
      t4.start();
      
      t1.join();
      t2.join();
      t3.join();
      t4.join();
      
      System.out.println("Count: "+c.count);
      
	}

}
