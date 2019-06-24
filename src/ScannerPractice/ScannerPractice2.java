package ScannerPractice;

import java.util.Scanner;

public class ScannerPractice2 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please provide yuor name below");
		String name=input.next();
		System.out.println("I see, your name is " + name);
		
		System.out.println("Please enter your birth year below");
		
		int birthYear=input.nextInt();
		
		int age=2019-birthYear;
		
		System.out.println("Dear " +name +","+ " your age is " + age);
		
		System.out.println("Is this correct?");
		String word=input.next();
		System.out.println("OMG " +name + " You are sooo young :)");
		
	}

}
