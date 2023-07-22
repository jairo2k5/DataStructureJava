package com.jairosilva.tests;

import com.jairosilva.vectors.VectorObject;

public class VectorObjectClass {

	public static void main(String[] args) {
		/* updating 21/07/2023 */
		VectorObject vector = new VectorObject(2); // Increase method and vectorObject
		vector.add(1); // Add method
		vector.add(2);
		vector.add(3);
		vector.add(4); // Add method
		vector.add(0, 12); // Add position method
		System.out.println(vector.exists(12)); // Exists method
		System.out.println(vector.find(0)); // Find method
		vector.remove(0); // Remove method
		System.out.println(vector.toString()); // toString method
	}

}
