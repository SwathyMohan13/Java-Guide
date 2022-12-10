interface Implement{
	void show();
}

class Pen{
	public void write() {
		System.out.println("Writing using pen");
	}
}

public class AnonymousJava {

	public static void main(String[] args) {
		//Anonymous class
		Pen p = new Pen() 
		{
			public void write() {
				System.out.println("Writing using pencil");
			}
		};   
		p.write();
		
		//Anonymous class with interface
		Implement c = new Implement()
		{
			public void show() {
				System.out.println("This is interface method");
			}
		};
		c.show();
		
		//Lambda Expression
		Implement in = ()-> System.out.println("This is interface method");
		in.show();
		
		

	}

}
