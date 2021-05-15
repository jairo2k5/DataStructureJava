package com.jairosilva.vectors;

public class List<T> {

	private T[] elements;
	private int size;

	public int getSize() {
		return this.size;
	}

	@SuppressWarnings("unchecked")
	public List(int capacity) {
		this.elements = (T[]) new Object[capacity];
		this.size = 0;
	}

	public boolean add(T element) {
		increase();
		if(this.size < this.elements.length) {
			this.elements[this.size] = element;
			this.size++;
			return true;
		} 
		return false;
	}

	public boolean add(int position, T element) {
		if(!(position >= 0 && position < this.size)) {
			throw new  IllegalArgumentException("Posição não existe!");
		}

		increase();

		// Move all elements
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
		for(T element:elements) {
			if(element != null) {
				returnElements.append("[");
				returnElements.append(element);
				returnElements.append("]");
			}
		}
		return returnElements.toString();
	}

	public T get(int position) {
		return this.find(position);
	}

	public T find(int position) {
		if(!(position >= 0 && position < this.size)) {
			throw new  IllegalArgumentException("Posição não existe!");
		}
		return this.elements[position];
	}

	public int exists(T element) {
		for(int i = 0; i < this.size; i++) {
			if(this.elements[i].equals(element)) {
				return i;
			}
		}
		return -1;
	}

	public boolean contains(T element) {
		return this.exists(element) >= 0 ? true : false;
	}

	public int lastIndex(T element) {
		for(int i = this.size-1; i >= 0; i--) {
			if(this.elements[i].equals(element)) {
				return i;
			}
		}
		return -1;
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

	public void remove(T element) {
		int pos = this.exists(element);
		if(pos >= 0) {
			this.remove(pos);
		}
	}

	public void clear() {
		for(int i = 0; i < this.size; i++) {
			this.elements[i] = null;
		}
		this.size = 0;
	}

}
