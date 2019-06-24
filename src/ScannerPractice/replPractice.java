package ScannerPractice;

import java.util.Scanner;

public class replPractice {
public static void main(String[] args) {
	 String  firstName, lastName, email, street, state, city, address;
	    int age, homeNum, zipcode;
	    double height, weight;
	    boolean isMarried;
	    long workPhoneNumber, personalPhoneNumber;
	    Scanner scan=new Scanner (System.in);
	    System.out.println("Welcome to the patient portal!");
	    System.out.println("Please enter your personal information");
	    System.out.println("Enter your first name");
	    firstName=scan.next();
	    System.out.println("Enter your last name");
	    lastName=scan.next();
	    System.out.println("Enter your email");
	    email=scan.next();
	    System.out.println("Enter your street");
	    homeNum=scan.nextInt();
	    street=scan.nextLine();
	    
	    System.out.println("Enter your city");
	    city=scan.nextLine();
	    System.out.println("Enter your state");
	    state=scan.nextLine();
	    System.out.println("Enter your zip code");
	    zipcode=scan.nextInt();
	    System.out.println("Enter your work phone number");
	    workPhoneNumber=scan.nextLong();
	    System.out.println("Enter your personal phone number");
	    personalPhoneNumber=scan.nextLong();
	    System.out.println("Enter your age");
	    age=scan.nextInt();
	    System.out.println("Enter your height");
	    height=scan.nextDouble();
	    System.out.println("Enter your personal weight");
	    weight=scan.nextDouble();
	    System.out.println("Are you married?");
	    address=homeNum+street;
	    isMarried=scan.nextBoolean();
	    System.out.println("Patient personal information");
	    System.out.println("Full name: "+lastName+", "+firstName);
	    System.out.println("Address: "+address+", "+city+", "+state+" "+zipcode);
	    System.out.println("Contacts: work phone number - "+workPhoneNumber+", "+"personal phone number - "+personalPhoneNumber+", email: "+email);
	    System.out.println("Age: "+age);
	    System.out.println("Height: "+height);
	    System.out.println("Weight: "+weight+" pounds");
	    System.out.println("Married?: "+isMarried);
}
}