
public class conditionStatements {
	
	//if-else and elseif ladder

	public static void main(String[] args) {
		int a= 15, b= 12, c= 150;
		
		if(a>b && a>c) {
			System.out.println("A is the Greatest");
		}
		else if(b>a && b>c) {
			System.out.println("B is the greatest");
		}
		else{
			System.out.println("C is the greatest");
		}
		
		//Switch Statement
		int cas = 5;
		
		switch(cas) {
		case 1:
			System.out.println("One"); break;
		case 2:
			System.out.println("Two");break;
		case 3:
			System.out.println("Three");break;
		case 4:
			System.out.println("Four");break;
		case 5:
			System.out.println("Five");break;
			
		default: System.out.println("No match found");
			
		}
		
		
	}

}
