class InfosysAdmin{  //Parent class(SuperClass)
	int empid;
	String empname;
	String projectcode;
	
	public void details(double tax, float renum) {
		double sal = tax+renum;
		System.out.println(empid+" : "+empname+" : "+projectcode+" : "+sal);
	}
}

//Child class (subclass)
class InfyPort extends InfosysAdmin{  //Inheriting the InfosysAdmin class
	 
	String blood;
	long mobile;
	
	public void personal() {
		System.out.println(blood+" : "+mobile);
	}
}


//Multi level Inheritance
class InfyTotal extends InfyPort{  //Inheriting the InfyPort class
	 
	String address = "Bang";
	boolean confirm = true;
	
	public void show() {
		String con;
		if(confirm) {
			con = "Yes";
		}
		else {
			con = "No";
		}
		System.out.println(address+" : Confirmation: "+con);
	}
}
public class inheritanceJava {

	public static void main(String[] args) {
		
		InfyTotal infpo = new InfyTotal();
		infpo.empid = 101;
		infpo.empname = "Swathy";
		infpo.projectcode = "BBR4";
		infpo.blood = "B+VE";
		infpo.mobile = 6385270309l;
		infpo.details(52.5, 2000.4f);
		infpo.personal();
		infpo.show();
		

	}

}
