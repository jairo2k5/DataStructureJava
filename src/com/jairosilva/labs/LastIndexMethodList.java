package com.jairosilva.labs;

import com.jairosilva.vectors.List;

public class LastIndexMethodList {

	public static void main(String[] args) {
		List<String> countrys = new List<String>(10);
		countrys.add("Brazil");
		countrys.add("United States");
		countrys.add("USA");
		countrys.add("Japan");
		countrys.add("Brazil");
		System.out.println(countrys.lastIndex("Brazil"));
	}

}
