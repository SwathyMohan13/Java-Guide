
public class WrapperClassJava {

	public static void main(String[] args) {
		 
		int i = 5; //Primitive Data type
		 
		 Integer value = new Integer(i);  //Boxing(Wrapping)
		 
		 int j = value.intValue();  //UnBoxing(UnWrapping)
		 
		 String value2 = "Thiru"; //AutoBoxing
		 
		 String k = value2;  //Auto Unboxing
		 
		 System.out.println("Unboxed the Value: "+j);
		 
		 System.out.println("Auto Unboxed the Value: "+k);
		 
		 String val = "23";
		 
		 int name = Integer.parseInt(val);  //Converting string to int value
		 
		 System.out.println(name);
	}

}
