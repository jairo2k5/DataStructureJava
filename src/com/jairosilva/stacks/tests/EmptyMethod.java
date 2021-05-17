package com.jairosilva.stacks.tests;

import com.jairosilva.stacks.Stack;

public class EmptyMethod {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		System.out.println(stack.empty());
		stack.stackUp("Joãozinho");
		System.out.println(stack.empty());
	}

}
