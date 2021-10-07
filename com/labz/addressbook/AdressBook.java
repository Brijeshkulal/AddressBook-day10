package com.labz.addressbook;

public class AdressBook {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		String firstName = "Brijesh";
		String lastName = "kulal";
		String address = "Near SM Temple Badaje";
		String city = "Manjeshwar";
		String state = "Kerala";
		int pinCode = 671323;
		long mobileNumber = 8899221100l;
		String emailId = "Raj123@gmail.com";
		System.out.println("Name 	     : "  + firstName + " " + lastName + "\n"
                + "Address      : "  + address + "\n"
                + "City         : "  + city + "\n"
                + "State        : "  + state + "\n"
                + "ZipCode      : "  + pinCode + "\n"
                + "MobileNumber : "  + mobileNumber + "\n"
                + "EmailId      : "  + emailId + "\n" );

	}

}
