
public class variablesJava {

	public static void main(String[] args) {
		
	  
//Declaring variables
      int i = 5;
      short s = 10;
      long l = 50000000;
      double d = 5;  //Implicit conversion
      float f = 5.555f;
      char c = 'B';
      
      System.out.println("Integer: "+i);
      System.out.println("short: "+s);
      System.out.println("long: "+l);
      System.out.println("double: "+d);
      System.out.println("float: "+f);
      System.out.println("Character: "+c);
      
//Type Casting
      int cast = (int) 5.5;
      System.out.println("Type Casting value: "+cast);
      
//ASCII value
     c = 65; //'c' already declared in char data type
     System.out.println("Ascii value of given number is: "+c);  

	}

}
