abstract class India{   //Abstract Super class
	public abstract void dresses(); //Abstract method
	
	public void ApplyPan() {
		System.out.println("You are successfully applied");
	}
	
	public void GetAaadhar(Long i) {
		System.out.println("Your Aadhar No: "+i);
	}
}

class Tamil extends India{
	public void dresses() {
		System.out.println("Saree");
	}
	
}

class Gujarat extends India{
	public void dresses() {
		System.out.println("Choli");
	}
	
}

class Kashmir extends India{
	public void dresses() {
		System.out.println("Salwar");
	}
	
}


public class AbstractJava {

	public static void main(String[] args) {
		
		India ind = new Tamil();
		ind.dresses();
			
		ind = new Gujarat();
		ind.GetAaadhar(1234567890l);
	
		ind = new Kashmir();
		ind.ApplyPan();
		ind.dresses();

	}

}
