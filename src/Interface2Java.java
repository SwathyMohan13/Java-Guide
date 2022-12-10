interface Animal{
	int num = 15;   //Variable inside the interface become constant
	void sound();
	
	default void color() {   //Defining method inside interface using default
		System.out.println("Brown");
	}
}

interface Animal1 {
	
	default void color() {
		System.out.println("White");
	}
}

class Dog implements Animal, Animal1{
	
	public void sound() {
		System.out.println("Bark Bark");
	}
	
	public void color() {
		Animal1.super.color();    //Calling super interface method
		System.out.println("Light Brown");
	}
}


//Static methods in interface
interface Demo{
	
	static void display() {
		System.out.println("In Demo Display");
	}
}


public class Interface2Java {

	public static void main(String[] args) {
		//Calling Default method in interface
		Animal obj = new Dog();
		obj.sound();
		obj.color();
		
		//Calling Static method in interface
	    Demo.display();
		

	}

}
