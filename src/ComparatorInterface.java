import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(432);
		list.add(445);
		list.add(751);
		list.add(234);
		list.add(190);
		
		
		//Comparator Interface
		
		Comparator<Integer> comp = new Comparator<>() {

			@Override
			public int compare(Integer i, Integer j) {
				
				if(i%10>j%10) 
					return 1;
				else 
				    return -1;
						
			}
		};
		
        Collections.sort(list, comp);
		
		for(int k: list) {
			System.out.println(k);
		}
		
		
		
		//Another for comparator Interface
		Collections.sort(list, (i,j)->i%10>j%10?1:-1);
		System.out.println("Another method for Comparator Interface");
		
		for(int k: list) {
			System.out.println(k);
		}
		
	
	}

}
