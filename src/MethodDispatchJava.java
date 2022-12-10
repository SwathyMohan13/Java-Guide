class A{
	public void show() {
		System.out.println("Class A method");
	}
}

class B extends A{
	public void show() {
		System.out.println("Class B method");
	}
	public void config() {
		System.out.println("Config in B");
	}
}

class C extends A{
	public void show() {
		System.out.println("Class C method");
	}
}


public class MethodDispatchJava {
	
	//Compile time and run time

	public static void main(String[] args) {
		//runtime polymorphism
		A obj = new C();  //Extracting super class reference and sub class object
		obj.show();  
		
		obj = new B();
		obj.show();   //Dynamic method dispatch
	}

}
