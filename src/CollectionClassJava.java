import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClassJava {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Swaty");
		l.add("Aksay");
		l.add("Doly");
		l.add("Fasra");
		
		System.out.println("Unsorted values: "+l);
		
	    Collections.sort(l);
	    
	    System.out.println("Sorted in Ascending: "+l);
	    
	    Collections.reverse(l);
	    
	    System.out.println("Sorted in Descending: "+l);
	    
	    Collections.shuffle(l);
	    
	    System.out.println("Collapsed values: "+l);  //keeps changing

	}

}
