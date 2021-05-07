package com.jairosilva.tests;

import com.jairosilva.vectors.Vector;

public class RemoveMethod {
	public static void main(String[] args) {
		Vector vector = new Vector(10);
		vector.add("1 > Jairo Silva");
		vector.add("2 > Jairo Silva");
		vector.add("3 > Jairo Silva");
		vector.add("4 > Jairo Silva");
		
		// This method remove position
		vector.remove(1);
		System.out.println(vector.toString());
	}
}
