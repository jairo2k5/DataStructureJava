package com.jairosilva.tests;

import com.jairosilva.vectors.Vector;

public class ToStringMethod {

	public static void main(String[] args) {
		Vector vector = new Vector(10);
		vector.add("1 > Jairo Silva");
		vector.add("2 > Jairo Silva");
		vector.add("3 > Jairo Silva");
		vector.add("4 > Jairo Silva");
		vector.add("5 > Jairo Silva");
		
		// This method not show the null value elements
		System.out.println(vector.toString());
	}

}
