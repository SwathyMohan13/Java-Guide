import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapJava {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Swathy");
		map.put(2, "Thiru");
		map.put(3, "Harish");
		map.put(4, "Priya");
		map.put(5, "Viya");
				
		int n;
		System.out.println("Enter the Key Value: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(n+ " : "+map.get(n));
		
		
		//Another way of getting value
		Set<Integer> keys = map.keySet();
		for(Integer key: keys) {
			System.out.println(key+" : "+map.get(key));
		}

	}

}
