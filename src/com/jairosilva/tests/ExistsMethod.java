package com.jairosilva.tests;

import com.jairosilva.vectors.Vector;

public class ExistsMethod {

	public static void main(String[] args) {
		Vector vector = new Vector(10);
		vector.add("1 > Jairo Silva");
		vector.add("2 > Jairo Silva");
		vector.add("3 > Jairo Silva");
		vector.add("4 > Jairo Silva");
		vector.add("5 > Jairo Silva");
		
		/*	This method return -1 and 1 if
		 * 	if element exists in array, this method return the position of value
		 * 	else return -1
		 * */
		System.out.println(vector.exists("5 > Jairo Silva"));
	}

}
