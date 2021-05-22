package com.jairosilva.queues.tests;

import com.jairosilva.queues.PriorityQueue;

public class PriorityQueueClass {

	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		priorityQueue.toQueue(5);
		priorityQueue.toQueue(4);
		priorityQueue.toQueue(3);
		priorityQueue.toQueue(2);
		priorityQueue.toQueue(1);
		System.out.println(priorityQueue.toString());
	}

}
