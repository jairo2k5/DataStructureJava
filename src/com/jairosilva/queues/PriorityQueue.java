package com.jairosilva.queues;

public class PriorityQueue<T> extends Queuex<T> {
	
	@SuppressWarnings("unchecked")
	public void toQueue(T element) {
		Comparable<T> key = (Comparable<T>) element;
		int i;
		for(i = 0; i < this.size; ++i) {
			if(key.compareTo(this.elements[i]) < 0) {
				break;
			}
		}
		this.add(i, element);
	}
}
