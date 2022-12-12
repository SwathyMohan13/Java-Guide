class Boss extends Thread{
	public void run() {
		
		for(int i = 1; i<=5; i++) 
		{
		System.out.println("Boss-"+i);
		try {Thread.sleep(500);} catch (InterruptedException e) {}
	    }
}
}

class Helo extends Thread{
	public void run() {
		
		for(int i = 1; i<=5; i++) 
		{
		System.out.println("Hello-"+i);
		try {Thread.sleep(500);} catch (InterruptedException e) {}
	    }
		System.out.println("Execution Completed");
}
}
	
		
public class ThreadsJava {

	public static void main(String[] args) {
		Boss b = new Boss();
		Helo h = new Helo();
		b.start();
		try {Thread.sleep(20);} catch (InterruptedException e) {}
		h.start();

	}

}
