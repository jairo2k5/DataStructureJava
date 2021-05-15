package com.jairosilva.labs;

import com.jairosilva.tests.Contact;
import com.jairosilva.vectors.List;
import java.util.Scanner;

public class Contacts {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Contact> contacts = new List<Contact>(20);
		// makeDynamicContacts(5, contacts);
		System.out.println(contacts.toString());

		int option = 1;
		while(option != 0) {
			option = getMenuOption(scanner);
			switch(option) {
			case 1:
				addContactEnd(scanner, contacts);
				break;
			case 2:
				addContactPosition(scanner, contacts);
				break;
			case 3:
				getContact(scanner, contacts);
				break;
			case 4:
				getContactPosition(scanner, contacts);
				break;
			case 5:
				// 32:16
				break;
			default:
				break;
			}
		}
		System.out.println("Exited.");
	}

	private static void getContactPosition(Scanner scanner, List<Contact> aux) {
		int position = readInformationsInt("Enter the contact's position: ", scanner);
		try {
			Contact contact = aux.find(position);
			System.out.println("Existing contact! information: ");
			System.out.println(contact.toString());
			System.out.println("Searching for the contact found: ");
			position = aux.exists(contact);
			System.out.println("Contact found in position: " + position);
		} catch (Exception e) {
			System.out.println("Invalid position!");
		}
	}

	private static void getContact(Scanner scanner, List<Contact> aux) {
		int position = readInformationsInt("Enter the contact's position: ", scanner);
		try {
			Contact contact = aux.find(position);
			System.out.println("Existing contact! information: ");
			System.out.println(contact.toString());
		} catch (Exception e) {
			System.out.println("Invalid position!");
		}
	}

	private static void addContactPosition(Scanner scanner, List<Contact> list) {
		System.out.println("> Creating a new contact");
		String name = readInformations("Your name: ", scanner);
		String phone = readInformations("Your phone: ", scanner);
		String email = readInformations("Your email: ", scanner);
		Contact contact = new Contact(name, phone, email);
		int position = readInformationsInt("Enter the position: ", scanner);
		try {
			list.add(position, contact);
			System.out.println("Contact added sucessfully!");
		} catch(Exception e) {
			System.out.println("Invalid position! task aborted!");
		}
	}

	private static void addContactEnd(Scanner scanner, List<Contact> list) {
		System.out.println("> Creating a new contact");
		String name = readInformations("Your name: ", scanner);
		String phone = readInformations("Your phone: ", scanner);
		String email = readInformations("Your email: ", scanner);
		Contact contact = new Contact(name, phone, email);
		list.add(contact);
		System.out.println("Contact added sucessfully!");
	}

	private static String readInformations(String message, Scanner scanner) {
		System.out.println(message);
		String entrada = scanner.nextLine();
		return entrada; // 21:52
	}

	// Divisor

	private static int readInformationsInt(String message, Scanner scanner) {
		boolean validate = false;
		int n = 0;
		while(!validate) {
			try {
				System.out.println(message);
				String input = scanner.nextLine();
				n = Integer.parseInt(input);	
				validate = true;
			} catch(Exception e) {
				System.out.println("Invalid entry, type again!");
			}
		}
		return n;
	}


	private static int getMenuOption(Scanner scanner) {

		boolean proceed = false;
		int option = 0;
		String input;

		while(!proceed) {
			System.out.println("-> Select your option <-");
			System.out.println("1: Add contact at the end of the vector");
			System.out.println("2: Add contact at a specific position");
			System.out.println("3: Show specific contact");
			System.out.println("4: Search for contact");
			System.out.println("5: Show last position of the vector");
			System.out.println("6: Check if a contact exists");
			System.out.println("7: Remove from position");
			System.out.println("8: Remove contact");
			System.out.println("9: Size of vector");
			System.out.println("10: Clean vector");
			System.out.println("11: Show all positions of vector");
			System.out.println("0: Exit");

			try {
				input = scanner.nextLine();
				option = Integer.parseInt(input);
				if(option >= 0 && option <= 11) {
					proceed = true; // 16:44
				} else {
					throw new Exception();
				}
			} catch(Exception e) {
				System.out.println("Invalid input!\n\n");
			}
		}
		return option;
	}

	private static void makeDynamicContacts(int size, List<Contact> aux) {
		Contact contact;
		for(int i = 0; i < size; i++) {
			contact = new Contact();
			contact.setName("Contact ["+ i +"]");
			contact.setEmail("contactemail"+ i +"@gmail.com");
			contact.setPhone("99810123" + i);
			aux.add(contact);
		}
	} 

}
