package com.jairosilva.stacks.tests;

import java.util.Stack;

public class StackApi {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("1: One");
		stack.push("2: One");
		stack.push("3: One");
		stack.push("4: One");
		stack.pop();
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.toString());
	}

}
