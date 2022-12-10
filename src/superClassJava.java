class Don { //Super class
	public Don() {
		System.out.println("In Don");
	}
	
	public Don(String name) {
		System.out.println("In Don: "+name);
	}
	
	public void func() {
		System.out.println("Don method");
	}
	
	public void func(String i) {
		System.out.println("Don method "+i);
	}
}

//Sub class
class Mass extends Don{          
	public Mass() {
		super();
		System.out.println("In Mass");
	}

	//
	public Mass(String name) {
		super(name);
		System.out.println("In Mass: "+name);
	}
	
	//It is over-riding the super class method
	@Override 
	public void func() {
		super.func("Swathy");
		System.out.println("Mass method");
	}
	
	public void func(int i) {
		super.func();
		System.out.println("Mass method "+i);
	}
}
public class superClassJava {

	public static void main(String[] args) {
		Mass obj1 = new Mass();  //To call default constructors
        obj1.func(5);  //It will call Argumented sub class and unargumented super class
        obj1.func();   //It will call default sub class and argumented super class

	}

}
