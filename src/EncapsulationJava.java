class Encap{
	private int rollno;
	private String name, desig;
	
	//Setter method
	public void valueset(int rollno, String name, String desig) {
		this.rollno = rollno;
		this.name = name;
		this.desig = desig;
	}
	
	
	//Getter method
	public int valueget() {
		return rollno;
	}
	public String valueget1() {
		return name;
	}
	public String valueget2() {
		return desig;
	}
}
public class EncapsulationJava {

	public static void main(String[] args) {
		Encap e = new Encap();
		e.valueset(1001, "Swathy", "Senior Systems Associate");
		System.out.println(e.valueget());
		System.out.println(e.valueget1());
		System.out.println(e.valueget2());;

	}

}
