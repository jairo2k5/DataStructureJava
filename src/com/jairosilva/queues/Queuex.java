package com.jairosilva.queues;

import com.jairosilva.base.StaticStructure;

public class Queuex<T> extends StaticStructure<T> {
	public Queuex() {
		super();
	}
	public Queuex(int size) {
		super(size);
	}
	public void toQueue(T element) {
		super.add(element);
	}
	public T spy() {
		if(this.empty()) {
			return null;
		}
		return this.elements[0];
	}
	public T dequeue() {
		if(this.empty()) return null;
		T element = this.elements[0];
		super.remove(0);
		return element;
	}
}
