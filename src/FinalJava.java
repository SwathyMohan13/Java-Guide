final class One{   //final class properties can't be inherited
	
	public final void method() {   //final method can't be overridden
		final int i = 10;          //final variable can't be changed(Constant)
		System.out.println("Value of method: "+i);
	}
	
}

class Two{
	public void method1() {
		String name = "Mohan";
		System.out.println("Name of the method: "+name);
	}
}

public class FinalJava {

	public static void main(String[] args) {
         One obj = new One();
         Two obj1 = new Two();
         obj1.method1();
         obj.method();
         

	}

}
