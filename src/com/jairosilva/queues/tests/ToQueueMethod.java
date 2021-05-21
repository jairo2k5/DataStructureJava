package com.jairosilva.queues.tests;

import com.jairosilva.queues.Queue;

public class ToQueueMethod {

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		queue.toQueue(1);
		queue.toQueue(2);
		queue.toQueue(3);
		System.out.println(queue.empty());
		System.out.println(queue.getSize());
		System.out.println(queue.toString());
	}

}
