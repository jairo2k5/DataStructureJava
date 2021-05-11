package com.jairosilva.labs;

import com.jairosilva.vectors.List;

public class GetMethodList {

	public static void main(String[] args) {
		List<String> states = new List<String>(10);
		states.add("Florida");
		states.add("Texas");
		states.add("Califórnia");
		states.add("Chicago");
		System.out.println(states.get(3));
	}

}
