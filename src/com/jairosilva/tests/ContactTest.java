package com.jairosilva.tests;

import com.jairosilva.vectors.VectorObject;

public class ContactTest {
	public static void main(String[] args) {
		VectorObject vector = new VectorObject(3);
		
		Contact firstContact = new Contact("Jairo Silva 1", "0123456789", "jairo@gmail.com");
		Contact secondContact = new Contact("Jairo Silva 2", "0123456789", "jairo2@gmail.com");
		Contact thirdContact = new Contact("Jairo Silva 3", "0123456789", "jairo3@gmail.com");
		Contact fourContact = new Contact("Jairo Silva 3", "0123456789", "jairo3@gmail.com");
		
		vector.add(firstContact);
		vector.add(secondContact);
		vector.add(thirdContact);
		
		if(vector.exists(fourContact) != -1) {
			System.out.println("O elemento existe!");
		} else {
			System.out.println("O elemento não existe!");
		}
		
		System.out.println(vector.toString());
	}
	
}
