
public class ExceptionHandlingJava {

	public static void main(String[] args) {
   
      try {
    	  int j = 10/2;
    	  System.out.println(j);
    	  
    	  int i = 10/0;
    	  System.out.println("Try Block");
    	  
    	  int a[] = {1,2,3,4};
    	  System.out.println(a[5]);
    	  
    	  int b[] = null;
    	  b[3]=5;
    	 
      }
      
      catch(ArithmeticException e ) {
    	  System.err.println("Can't divide the number by zero");
      }
      
      
      catch(ArrayIndexOutOfBoundsException e) {
    	  System.err.println("Stay in the limit.. ");
      }
      
      catch(Exception e) {
    	  System.err.println("Something went wrong");
      }
      
      
      finally{
    	  int n = 2;
    	  for(int m=1; m<=n; m++) {
    		  System.out.println("Finally block");
    	  }
    	  
      }

	}

}
