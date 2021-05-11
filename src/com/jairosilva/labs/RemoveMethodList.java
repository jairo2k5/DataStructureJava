package com.jairosilva.labs;

import com.jairosilva.vectors.List;

public class RemoveMethodList {

	public static void main(String[] args) {
		List<String> ages = new List<String>(10);
		ages.add("12");
		ages.add("13");
		ages.add("14");
		System.out.println(ages.toString());
		ages.remove("13");
		System.out.println(ages.toString());
	}

}
