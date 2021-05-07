package com.jairosilva.tests;

import com.jairosilva.vectors.Vector;

public class IncreaseMethod {

	public static void main(String[] args) {
		Vector vector = new Vector(2); // Size 3
		vector.add("Jairo Silva");
		vector.add("Jairo Silva");
		vector.add("Jairo Silva");
		vector.add("Jairo Silva");
		vector.add("Jairo Silva");
		vector.add("Jairo Silva");
		vector.add("Jairo Silva");
		// Elements: 7
		
		System.out.println(vector.toString());

		// Analyze the increase method in class: com.jairosilva.vectors.Vector
	}

}
