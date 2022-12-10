
public class LoopsJava {

	public static void main(String[] args) {   
		
		int i = 1;
		
		//while
		System.out.println("While Loop");
		while(i<=5) {
		
			System.out.println("Printing "+i);
			i++;
			
		}
		
		//do-while
		System.out.println("Do-while Loop");
		int j =1;
		do {
			System.out.println("Printing "+j);
			j++;
		}
		while(j<=10);
		
		//For-loop()
		System.out.println("For Loop");
		int num = 6;
		int fact =1;
		for(int f=1; f<=num; f++) {  //Initialisation--> Condition --> Increment
			
			fact*=f;
			System.out.println(fact);
		}
	}}
		
		



