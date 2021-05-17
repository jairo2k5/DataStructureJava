package com.jairosilva.stacks.tests;

import com.jairosilva.stacks.Stack;

public class TopMethod {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.stackUp("1: Joãozinho");
		stack.stackUp("2: Mariazinha");
		System.out.println(stack.top());
		System.out.println(stack.toString());
		System.out.println(stack.getSize());
	}

}
