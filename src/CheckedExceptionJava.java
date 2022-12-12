import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckedExceptionJava {

	public static void main(String[] args) throws NumberFormatException, IOException {

         /*try {
        	 int a = 10;
        	 System.out.println("Value of a: "+a);
        	 System.out.println("Enter the value of b: ");
             Scanner sc = new Scanner(System.in);
             int b = sc.nextInt();
             int c = a/b;
             System.out.println("Value of c: "+c);
             
             //nested try
             try {
            	 if(b<=1) {
            		 c = a/(b-1);
            	 }
             }
          
             //catch block
         catch(ArithmeticException e){
        	 
        	 System.err.println("Error: "+e);
        	 
         }}
          //try block closed here
             
         Finally block
             finally{
           	  int n = 2;
           	  for(int m=1; m<=n; m++) {
           		  System.out.println("Finally block");
           	  }
             }*/
         
         
         BufferedReader br = null;
         br = new BufferedReader(new InputStreamReader(System.in));
         
         System.out.println("Enter the value of n: ");
         int n = Integer.parseInt(br.readLine());	
         
         int a = 20;
         int c = a/n;
         System.out.println(c);
         
         //Can write tryblock alone with the below syntax
         
         try(BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in))){
        	 System.out.println("Enter the value of n1: ");
        	 int n1 = Integer.parseInt(br1.readLine());
        	 
        	 int a1 = 20;
             int c1 = a/n1;
             System.out.println(c1);
         }
	}
	
}

      


