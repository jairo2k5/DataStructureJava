package com.jairosilva.base;

public class StaticStructure<T> {
	protected T[] elements;
	protected int size;

	@SuppressWarnings("unchecked")
	public StaticStructure(int size) {
		this.elements = (T[]) new Object[size];
		this.size = 0;
	}
	public StaticStructure() {
		this(10);
	}

	protected boolean add(T element) {
		increase();
		if(this.size < this.elements.length) {
			this.elements[this.size] = element;
			this.size++;
			return true;
		} 
		return false;
	}

	protected boolean add(int position, T element) {
		if(!(position >= 0 && position <= this.size)) {
			throw new  IllegalArgumentException("Posição não existe!");
		}
		this.increase();
		for(int i = this.size-1; i >= position; i--) {
			this.elements[i+1] = this.elements[i];
		}
		this.elements[position] = element;
		this.size++;
		return true;
	}

	@SuppressWarnings("unchecked")
	private void increase() {
		if(this.size == this.elements.length) {
			T[] newElements = (T[]) new Object[this.elements.length * 2];
			for(int i = 0; i < this.elements.length; i++) {
				newElements[i] = this.elements[i];
			}
			this.elements = newElements;
		}
	}

	public int getSize() {
		return this.size;
	}

	@Override
	public String toString() {
		StringBuilder returnElements = new StringBuilder();
		for(int i = 0; i < this.size; i++) {
			if(this.elements[i] != null) {
				returnElements.append("[");
				returnElements.append(this.elements[i]);
				returnElements.append("]");
			}
		}
		return returnElements.toString();
	}
	
	public boolean empty() {
		if(this.size == 0) {
			return true;
		}
		return false;
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
