package com.jairosilva.tests;

import java.util.ArrayList;

public class ArrayListApi {

	public static void main(String[] args) {
		ArrayList<Integer> ages = new ArrayList<Integer>(10);
		ages.add(123);
		ages.add(321);
		ages.add(132);
		System.out.println(ages.contains(11));
		System.out.println(ages.toString());
		ages.remove(1);
		System.out.println(ages.toString());
		System.out.println(ages.indexOf(132));
		System.out.println(ages.get(0));
	}

}
