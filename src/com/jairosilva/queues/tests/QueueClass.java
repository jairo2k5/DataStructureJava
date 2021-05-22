package com.jairosilva.queues.tests;

import com.jairosilva.queues.Queuex;

public class QueueClass {

	public static void main(String[] args) {
		Queuex<String> queue = new Queuex<String>(10);
		System.out.println(queue.empty());
		System.out.println(queue.getSize());
	}

}
