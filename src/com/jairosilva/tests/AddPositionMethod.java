package com.jairosilva.tests;

import com.jairosilva.vectors.Vector;

public class AddPositionMethod {

	public static void main(String[] args) {
		Vector vector = new Vector(10);
		vector.add("1 > Jairo Silva");
		vector.add("2 > Jairo Silva");
		vector.add("3 > Jairo Silva");
		vector.add("4 > Jairo Silva");
		vector.add("5 > Jairo Silva");
		
		// Add in position method
		vector.add(4, "4 > Element");
	}

}
