package com.jairosilva.labs;

import com.jairosilva.vectors.List;

public class ContainsMethodList {
	public static void main(String[] args) {
		List<String> names = new List<String>(10);
		names.add("1 > Jairo Silva");
		names.add("2 > Jairo Silva");
		names.add("1 > Jairo Silva");
		names.add("2 > Jairo Silva");
		System.out.println(names.contains("0 > Jairo Silva"));
	}
}
