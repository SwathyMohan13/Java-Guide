class Student{
	int rollno;
	float marks;
	String name;
	static String school;

static {
	school = "Anglo Indian";
}
	
public Student() {
	rollno = 101;
	marks = 56.4f;
}

public Student(int rollno, float marks) {
    this.rollno = rollno;
    this.marks = marks;
}

public Student(int rollno, float marks, String name) {
    this.rollno = rollno;
    this.marks = marks;
    this.name = name;
}

public void show() {
	System.out.println(rollno+ " : "+marks+" : "+name+" : "+school);
}

}
public class Array1DJava {

	public static void main(String[] args) {
		
		//1D-Array
		int num[] = new int[5];
		num[0] = 21;
		num[1] = 76;
		num[2] = 26;
		num[3] = 78;
		num[4] = 90;
		
		System.out.print("One-Dimensional Array values are:");
		//Enhanced loop for one-dimensional array
		for(int val: num) {
			System.out.print(" "+val);  
		}
		
		/*for(int i=0; i<=num.length-1;i++) {
			System.out.print(" "+num[i]);
		}*/
		
		System.out.println();
		
		//Creating objects for class
		Student obj = new Student();
		Student obj2 = new Student(102, 56.8f);
		Student obj3 = new Student(103, 99.7f, "Swathy");
        
		//Array of Objects
		Student[] student = new Student[3];
		student[0] = obj;
		student[1] = obj2;
		student[2] = obj3;
		
	    for(int i=0; i<=student.length-1; i++) {
	    	student[i].show();
	    }
		

	}

}
