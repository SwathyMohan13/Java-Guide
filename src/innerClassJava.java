class Outer{
	public void show() {
		System.out.println("outside class");
	}
	
static class Inner{
	public void display() {
		System.out.println("Inner Class");
	}
}

class Inner1{
	public void expose() {
		System.out.println("Inner Class 2");
	}
}
}



public class innerClassJava {

	public static void main(String[] args) {
		//Calling outer class
		Outer obj = new Outer();
		obj.show();
		
		//calling static inner class
		Outer.Inner obj1 = new Outer.Inner();
		obj1.display();
		
		//calling normal inner class
		Outer.Inner1 obj2 = obj.new Inner1();
		obj2.expose();

	}

}
