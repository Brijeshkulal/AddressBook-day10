package com.labz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AdressBook {
	Scanner sc = new Scanner(System.in);
	ArrayList<ContactPerson> list = new ArrayList<ContactPerson>();
	ContactPerson person = new ContactPerson();
	
	public void addContact() {
		System.out.println("number of contacts to be added");
		int n =sc.nextInt();
		for (int i=0;i<n;i++)
		{
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
		person = new ContactPerson(firstName, lastName, address, city, state, zip, phoneNumber, email);
		list.add(person);
		print();
		}
		
		
	}
	public void print() {
		System.out.println("Contact Details");
		System.out.println("Name 	      : "  + person.getLastName()+ " " + person.getLastName() + "\n"
                		+ "Address       : "  + person.getAddress() + "\n"
                		+ "City          : "  + person.getCity() + "\n"
                		+ "State         : "  + person.getState() + "\n"
                		+ "Zip       	: "  + person.getZip() + "\n"
                		+ "MobileNumber  : "  + person.getPhonenumber() + "\n"
                		+ "EmailId       : "  + person.getEmail() + "\n" );
		

		}
	
		
		public static void main(String[] args) {
			AdressBook addressbook = new AdressBook();		
			addressbook.addContact();
			
		}

	
}
