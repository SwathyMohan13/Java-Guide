import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>{
    int rollno;
    String name;
    int marks;
    
	
	
	public Stud(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
    
	@Override
	public String toString(){
		return "Stud[Rollno: "+rollno+" Name: "+name+" Marks: "+marks+"]";
	}
	
	
	public int compareTo(Stud o) {
		return name.length()>o.name.length()?1:-1;		
	}

	
}




public class ComparableInterfaceJava {

	public static void main(String[] args) {
		List<Stud> studs = new ArrayList<>();
		studs.add(new Stud(23,"Swathy",98));
		studs.add(new Stud(24,"Thiru",94));
		studs.add(new Stud(25,"Priya",71));
		studs.add(new Stud(26,"Hevanthika",87));
		
		Collections.sort(studs, (i,j)->i.marks>j.marks?1:-1);
		
		for(Stud s: studs) {
			System.out.println(s);
		}

	}

}
