class Addition{
	
   public int sum(int ...n ) {  //Variable Argument to accept the numbers as array in argument
	   int sum = 0;
	   for(int k: n) {
		   sum+=k;
	   }
	return sum;
   }
}

public class varargsJava {

	public static void main(String[] args) {
	   Addition add = new Addition();
	   System.out.println(add.sum(1,2,3,4,5,6,7,8,90,12,13,34,45,56));
   
	}

}
