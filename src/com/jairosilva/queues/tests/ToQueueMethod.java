package com.jairosilva.queues.tests;

import com.jairosilva.queues.Queuex;

public class ToQueueMethod {

	public static void main(String[] args) {
		Queuex<Integer> queue = new Queuex<Integer>();
		queue.toQueue(1);
		queue.toQueue(2);
		queue.toQueue(3);
		System.out.println(queue.empty());
		System.out.println(queue.getSize());
		System.out.println(queue.toString());
	}

}
