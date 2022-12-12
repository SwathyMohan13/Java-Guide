package com.learn.exceptions;

import java.util.Scanner;

public class UserdefinedExceptionJava {

	public static void main(String[] args) {
		
		int i = 10;
		System.out.println("Enter the value of j: ");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();	
		
		try {
			
			if(j == 0) 
				
				throw new UserException("j is 0, you can't the integer by Zero.");
			
			
		}
		
		catch(UserException e) {
			System.out.println("Error: "+e.getMessage());
		}

	}

}
