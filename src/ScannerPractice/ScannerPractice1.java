package ScannerPractice;

import java.util.Scanner;

public class ScannerPractice1 {
	
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter your name ");
	
	String name = input.next() ;
	
	System.out.println("Your name is " + name);
	
	System.out.println("Please enter your birth year ");
	
	int year = input.nextInt() ;
	
	year = (2019 - year - 10) ;
	
	System.out.println("Your age is " + year);
	
	
	
	System.out.println("Is this correct ?");
	
	String word = input.next() ;
	
	System.out.println("OMG!! You are so young");
	
	
			
}	

}
