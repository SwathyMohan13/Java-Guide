interface Icecream{
	void taste();
	void shape();
	void color();
	
}

class Chocolate implements Icecream{

	public void taste() {
		System.out.println("Taste: Chocolate");
	}

	public void shape() {
		System.out.println("Size: Cone");
		
	}
	
	public void color() {
		System.out.println("Color: Brown");
	}
	
	
}

class Venilla implements Icecream{
	public void taste() {
		System.out.println("Taste: Venilla");
	}

	public void shape() {
		System.out.println("Size: Scoop");
		
	}
	
	public void color() {
		System.out.println("Color: Creamy White");
	}
		
}

class Restaurant
{
	public void showsomething(Icecream ice) {
		ice.taste();
		ice.color();
		ice.shape();
	}
}
public class InterfaceJava {

	public static void main(String[] args) {
		
		Restaurant r = new Restaurant();

        Icecream c = new Chocolate(); //runtime polymorphism
        Icecream v = new Venilla();
        
        r.showsomething(v);
		
	}
	
	

}
