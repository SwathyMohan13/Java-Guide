
public class breakContinue {

	public static void main(String[] args) {
		int num=5;
		System.out.println("Continue Statement");
		for(int i=1; i<=num; i++) {
			
			if(i==3) {
				continue;  //It skips to the next iteration when the i=3;
			}
			System.out.println("I'm "+i);
		}
		
		
		System.out.println("Break Statement");
        for(int j=1; j<=num; j++) {
			
			if(j==4) {
				break;  //It breaks the loop when the j=4;
			}
			System.out.println("I'm "+j);
		}
	}

}
