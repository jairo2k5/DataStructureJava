package com.jairosilva.tests;

import com.jairosilva.vectors.List;

public class ListTest {

	public static void main(String[] args) {
		List<Contact> vector = new List<Contact>(10);
		Contact firstContact = new Contact("Jairo Silva 1", "0123456789", "jairo@gmail.com");
		Contact secondContact = new Contact("Jairo Silva 2", "0123456789", "jairo2@gmail.com");
		Contact thirdContact = new Contact("Jairo Silva 3", "0123456789", "jairo3@gmail.com");
		Contact fourContact = new Contact("Jairo Silva 3", "0123456789", "jairo3@gmail.com");
		vector.add(firstContact);
		vector.add(secondContact);
		vector.add(thirdContact);
		vector.add(fourContact);
		System.out.println(vector.toString());
	}

}
