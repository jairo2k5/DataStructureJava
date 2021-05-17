package com.jairosilva.stacks.tests;

import com.jairosilva.stacks.Stack;

public class StackDownMethod {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.stackUp("1: First Position");
		stack.stackUp("2: Second Position");
		System.out.println(stack.toString());
		System.out.println(stack.stackDown());
		System.out.println(stack.toString());
	}

}
