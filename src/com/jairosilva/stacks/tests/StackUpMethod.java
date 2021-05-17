package com.jairosilva.stacks.tests;

import com.jairosilva.stacks.Stack;

public class StackUpMethod {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0; i < 10; i++) {
			stack.stackUp(i);
		}
		System.out.println(stack.toString());
		System.out.println(stack.getSize());
	}

}
