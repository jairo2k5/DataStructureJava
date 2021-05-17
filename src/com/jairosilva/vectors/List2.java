package com.jairosilva.vectors;

import com.jairosilva.base.StaticStructure;

public class List2<T> extends StaticStructure<T> {
	public List2() {
		super();
	}
	public List2(int size) {
		super(size);
	}
	public boolean add(T element) {
		return super.add(element);
	}
	public boolean add(int position, T element) {
		return super.add(position, element);
	}
}
