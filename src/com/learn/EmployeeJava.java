package com.learn;


public class EmployeeJava {
   public int id = 101;  //Access everywhere
   private String name = "Thiru";  //Access within the own class
   protected float marks = 98.4f;  //Access all over the own package
   double d = 55.5;  //Access within the package


public static void main(String[] args) {
	EmployeeJava empjava = new EmployeeJava();
	empjava.id = 202;
	System.out.println(empjava.id);
	
	Student s = new Student();
	s.show();
	s.show2();
}
}

