package com.labz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AdressBook {
	Scanner sc = new Scanner(System.in);
	ArrayList<ContactPerson> list = new ArrayList<ContactPerson>();
	
	public void add() {
	    System.out.println("Enter First Name : ");
		String firstName = sc.next();
		System.out.println("Enter Last Name : ");
		String lastName = sc.next();
		System.out.println("Enter Address : ");
		String address = sc.next();
		System.out.println("Enter City : ");
		String city = sc.next();
		System.out.println("Enter State : ");
		String state = sc.next();
		System.out.println("Enter Zip : ");
		int zip = sc.nextInt();
		System.out.println("Enter Mobile Number : ");
		long phoneNumber = sc.nextLong();
		System.out.println("Enter Email : ");
		String email = sc.next();
		ContactPerson person = new ContactPerson(firstName, lastName, address, city, state, zip, phoneNumber, email);
		list.add(person);
		System.out.println("Name 	     : "  + firstName + " " + lastName + "\n"
                		+ "Address       : "  + address + "\n"
                		+ "City          : "  + city + "\n"
                		+ "State         : "  + state + "\n"
                		+ "Zip      	 : "  + zip + "\n"
                		+ "MobileNumber  : "  + phoneNumber + "\n"
                		+ "EmailId       : "  + email + "\n" );
		

		
	}
		public static void main(String[] args) {
			AdressBook addressbook = new AdressBook();		
			addressbook.add();
			
		}

	
}
