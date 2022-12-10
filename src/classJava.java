//Class creation
class Car {
	int num1;
	int num2;
	String name;
	String color;
	float price;  // instance variable
	
	
	//Constructor creation
	//This one is the default constructor. When you don't create any constructor. It will be called automatically when the object is created.
	public Car() {
		name = "Maruthi";
		color = "Copper Black";
		System.out.println("Using Constructor1");
	}
	
	//Constructor creation with parameter
	public Car(int num1, int num2) {
		//To differentiate local and instance variable, we used "this' keyword here.
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("Using Constructor2 "+this.num1+" "+this.num2);
	}
	
	//method creation with two parameters
	public void calc(float instal, float tax) {  // Local variable
		price = instal + tax;
		
	}
}

public class classJava {
	
 public static void main(String[] args) {
	 
	Car obj1 = new Car(); //Object creation 
	Car obj = new Car(7, 4); //Calling constructor with parameters
	
	//sending values to the parameters
	obj1.calc(2500.34f, 78934.34f);
	
	System.out.println(obj1.name);
	System.out.println(obj1.color);
	System.out.println(obj1.price);
	
	
    
	
}
}
