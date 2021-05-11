package com.jairosilva.labs;

import com.jairosilva.vectors.List;

public class ClearMethodList {

	public static void main(String[] args) {
		List<String> animals = new List<String>(10);
		animals.add("Lion");
		animals.add("Phanter");
		animals.add("Goat");
		System.out.println(animals.toString());
		animals.clear();
		System.out.println(animals.toString());
	}

}
