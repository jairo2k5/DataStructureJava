package com.jairosilva.vectors;

public class VectorObject {

	private Object[] elements;
	private int size;

	public int getSize() {
		return this.size;
	}
	
	public VectorObject(int capacity) {
		this.elements = new Object[capacity];
		this.size = 0;
	}
	
	public boolean add(Object element) {
		increase();
		if(this.size < this.elements.length) {
			this.elements[this.size] = element;
			this.size++;
			return true;
		} 
		return false;
	}
	
	public boolean add(int position, Object element) {
		if(!(position >= 0 && position < this.size)) {
			throw new  IllegalArgumentException("Posição não existe!");
		}
		increase();
		for(int i = this.size-1; i >= position; i--) {
			this.elements[i+1] = this.elements[i];
		}
		this.elements[position] = element;
		this.size++;
		return false;
	}

	@Override
	public String toString() {
		StringBuilder returnElements = new StringBuilder();
		for(Object element:elements) {
			if(element != null) {
				returnElements.append("[");
				returnElements.append(element);
				returnElements.append("]");
			}
		}
		return returnElements.toString();
	}

	public Object find(int position) {
		if(!(position >= 0 && position < this.size)) {
			throw new  IllegalArgumentException("Posição não existe!");
		}
		return this.elements[position];
	}

	public int exists(Object element) {
		for(int i = 0; i < this.elements.length; i++) {
			if(this.elements[i].equals(element)) {
				return i;
			}
		}
		return -1;
	}

	private void increase() {
		if(this.size == this.elements.length) {
			Object[] newElements = new Object[this.elements.length * 2];
			for(int i = 0; i < this.elements.length; i++) {
				newElements[i] = this.elements[i];
			}
			this.elements = newElements;
		}
	}

	public void remove(int position) {
		if(!(position >= 0 && position < this.size)) {
			throw new  IllegalArgumentException("Posição não existe!");
		}
		for(int i = position; i <= this.size; i++) {
			this.elements[i] = this.elements[i+1];
		}
		this.elements[this.size] = null;
		this.size--;
	}
}
