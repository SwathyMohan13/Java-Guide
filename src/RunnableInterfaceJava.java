	
public class RunnableInterfaceJava {

	public static void main(String[] args) throws InterruptedException {
		
		//Lambda Expression
		Thread t1 = new Thread(() -> {
			
			for(int i = 1; i<=5; i++) 
			{
			System.out.println("Java-"+i);
			try {Thread.sleep(500);} catch (InterruptedException e) {}
			}
		}, "Java Thread");
		    
		    
		Thread t2 = new Thread(() -> 
		    {
			for(int i = 1; i<=5; i++) 
			{
			System.out.println("Python-"+i);
			try {Thread.sleep(500);} catch (InterruptedException e) {}
			}
		 }, "Python Thread");
		
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		t2.start();
	
	    System.out.println(t1.getName()+ " : "+t2.getName());
		
		t1.join();  //Waiting to complete the particular thread
		t2.join();
		
		System.out.println(t1.isAlive());  //To check whether the thread execution is completed or not
		System.out.println(t2.isAlive());
		
		System.out.println("Execution Completed");
		
		
	}


}
