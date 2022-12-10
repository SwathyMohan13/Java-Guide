class Employee{
	int empid;
	String empname;
	static String ceo;
	
//Static block
static {
	ceo = "Salil Parekh";
	System.out.println("Loading static");
}

//Constructor
public Employee() {
	empid = 101;
    empname = "Swathy";
    System.out.println("Loading constructor 1");
}

//Constructor with 2 parameters
public Employee(int empid, String empname) {
	this.empid = empid;
	this.empname = empname;
	System.out.println("Loading constructor 2");
}

	
public void show() {
	System.out.println(empid+ ": "+empname+ ": "+ceo);
}
    
}

public class StaticJava {
	
  public static void main(String[] args) {
	  
	  Employee emp = new Employee();
	
	  Employee emp1 = new Employee(102,"Naveen");
	  
	  emp.show();
	  emp1.show();
	  
	  
  }
}
