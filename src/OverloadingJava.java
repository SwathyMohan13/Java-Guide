class Maths {
	int num1;
	int num2;
    
	
	//Constructor overloading
	public Maths() {
		System.out.println("Constructor with No parameter");
	}
	//Constructor creation with 2 parameter
	public Maths(int num1, int num2) {
		int result = num1+num2;
		System.out.println("Constructor2: "+result);
	}
	
	//Constructor creation with 2 parameter
	public Maths(int num1, int num2,int num3) {
		int result = num1+num2+num3;
		System.out.println("Constructor3: "+result);
	}
	
	
	//Method creation with no parameters
	public void sum() {
		int result = num1 + num2;
		System.out.println("Result1 "+result);
	}
	
	//Method overloading
	public void sum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("Result2 "+result);
	}
	
	public void sum(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		System.out.println("Result3 "+result);
	}
	
}
	
	
public class OverloadingJava {

	public static void main(String[] args) {
		//Calling constructors by creating objects.
		Maths obj = new Maths();
		Maths obj2 = new Maths(1000,2000);
		Maths obj3 = new Maths(3000,5000,6000);
		
		
		//Calling methods
		obj.num1 = 5;
		obj.num2 = 10;
		obj.sum(); //Calling method with no parameter
		obj.sum(20,30); //Calling method with 2 parameters
		obj.sum(1,2,3); //Calling method with 3 parameters

	}

}
