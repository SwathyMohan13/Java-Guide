import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class setJava {

	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<>();
		s.add(29);
		s.add(39);
		s.add(73);
		
		System.out.println("Unordered Values using Hash: "+s);
		
		Set<Integer> s1 = new TreeSet<>();
		s1.add(29);
		s1.add(39);
		s1.add(73);
		s1.add(29);  //Duplicate values wont be accepted in set
		
		for(int values: s1) {
			System.out.println("Ordered Values using Tree: "+values);
		}
		
		
	}

}
