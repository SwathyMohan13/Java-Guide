package com.learn;

class Student{
	public  void show() {
		System.out.println("public method");
	}
	
	private void show1() {
		System.out.println("Private method");
	}
	
	protected void show2() {
		System.out.println("Protected method");
	}
}

public class StudentJava {

	public static void main(String[] args) {
		EmployeeJava empjava = new EmployeeJava();
		empjava.marks = 78.4f;
		
        empjava.d = 11.1;
	}

}
