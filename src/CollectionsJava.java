import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionsJava {

	public static void main(String[] args) {
		
		//Defining collection
		Collection<Float> collect = new ArrayList<>();
		collect.add(29.4f);
		collect.add(30.9f);
		collect.add(15.2f);
		
		System.out.println(collect);
		
		
		//Defining List
		List<String> li = new ArrayList<>();
		li.add("Swathy");
		li.add("Priya");
		li.add("Thiru");
		li.add("Thiru");  //Duplicate values can be accepted in List
		
		for(String value : li) {
			System.out.println(value);
		}
		
		
		
		
	}

}
