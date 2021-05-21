package com.jairosilva.queues.tests;

import com.jairosilva.queues.Queue;

public class QueueClass {

	public static void main(String[] args) {
		Queue<String> queue = new Queue<String>(10);
		System.out.println(queue.empty());
		System.out.println(queue.getSize());
	}

}
