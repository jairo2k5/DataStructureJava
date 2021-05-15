package com.jairosilva.vectors;

public class Vector {

	private String[] elements;
	private int size;

	public int getSize() {
		return this.size;
	}

	public Vector(int capacity) {
		this.elements = new String[capacity];
		this.size = 0;
	}

	/* Old methods

	public void add(String element) {
		for(int i = 0; i < this.elements.length; i++) {
			if(this.elements[i] == null) {
				this.elements[i] = element;
				break;
			}
		}
	}

	public void add(String element) throws Exception {
		if(this.size < this.elements.length) {
			this.elements[this.size] = element;
			this.size++;
		} else {
			throw new Exception("O vetor já está cheio!");
		}
	}

	 */

	public boolean add(String element) {
		increase();
		if(this.size < this.elements.length) {
			this.elements[this.size] = element;
			this.size++;
			return true;
		} 
		return false;

	}

	public boolean add(int position, String element) {
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
		for(String element:elements) {
			if(element != null) {
				returnElements.append("[");
				returnElements.append(element);
				returnElements.append("]");
			}
		}
		return returnElements.toString();
	}

	public String find(int position) {
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
			String[] newElements = new String[this.elements.length * 2];
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

// * Class: 9
