
public class OperatorsJava {

	public static void main(String[] args) {
		
		//Arithmetic operators => +, -, *, /, %
	    int m= 6, n = 4;
	    
	    int div = m/n;  //return quotient only
	    
	    double div1 = m/n; //still return integer value because by default division operator 
	    //will return integer value
	    
	    double div2 = (double)m/n; //Type casted it to return the original double value
	    
	    System.out.println("Addition: "+(m+n));
	    System.out.println("Subtraction: "+(m-n));
	    System.out.println("Multiplication: "+(m*n));
	    System.out.println("Division: "+div);
	    System.out.println("Division1: "+div1);
	    System.out.println("Division2: "+div2);
	    System.out.println("Module: "+(m%n));
	    
	    
	    //Relational Operator
	    //Relational operator always gives boolean value here we are using ternary operator
	    int a = 8, b= 9;
	    System.out.println(a<b ? "Right" : "Wrong");
	    System.out.println(a>b ? "Right" : "Wrong");
	    System.out.println(a<=b ? "Right" : "Wrong");
	    System.out.println(a>=b ? "Right" : "Wrong");
	    System.out.println(a==b ? "Right" : "Wrong");
	    System.out.println(a!=b ? "Right" : "Wrong");
	    
	    //Logical Operator(OR = +, AND = *)
	    if(a>b && a!=b) {
	    	System.out.println("Matched");
	    }
	    else {
	    	System.out.println("Not Matched");
	    }
	    if(a>b || a!= b) {
	    	System.out.println("Matched");
	    }
	    else {
	    	System.out.println("Not Matched");
	    }
	    
	   //Bitwise Operator(AND-&, OR-|)
	    System.out.println("Bitwise And Operator: "+(a&b));
	    System.out.println("Bitwise OR Operator: "+(a|b));
	    
	    //Left and Right Shift Operator
	    int left = 8;
	    System.out.println("Left Shift Operator: "+(left << 2));  //It will increase 2 bytes at the left side
	    System.out.println("Right Shift Operator: "+(left >> 2)); //It will increase 2 bytes at the right side
	    
	    //Increment and decrement operator
	    int pre = 15;
	    int pos = 7;
	    System.out.println("Pre Increment: "+(++pre));  //Incremented before assign the value
	    System.out.println("Post Increment: "+(pos++)); //Assigned before incremented
	    
	    System.out.println("Pre Decrement: "+(--pre));  //16 decremented to 15
	    System.out.println("Post Decrement: "+(pos--)); //Its value is already 8 by post incrementing now its assigned before decrementing
	   
	    System.out.println("Final Value: "+pos);  //Final value of pos after decremented
	    
	    
	}

}
