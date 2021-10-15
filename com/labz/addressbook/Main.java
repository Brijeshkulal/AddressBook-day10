package com.labz.addressbook;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to the AddressBook Management System");
		Scanner sc = new Scanner(System.in);
		AdressBook addressbook = new AdressBook();	
		while (true) {
            System.out.println("Enter \n 1 To add The contact \n 2 To edit the contact \n 3 to exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addressbook.addContact();
                    break;
                case 2:
                    addressbook.editContact();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    continue;
            }
		}
	}
}
