package com.jairosilva.stacks;

import com.jairosilva.base.StaticStructure;

public class Stack<T> extends StaticStructure<T> {
	public Stack() {
		super();
	}
	public Stack(int size) {
		super(size);
	}
	public void stackUp(T element) {
		this.add(element);
	}
	public T top() {
		if(this.empty()) return null;
		return this.elements[this.size-1];
	}
	public T stackDown() {
		if(this.empty()) {
			return null;
		}
		return this.elements[--size];
	}
}
