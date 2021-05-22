package com.jairosilva.queues.tests;

import com.jairosilva.queues.Queuex;

public class SpyMethod {

	public static void main(String[] args) {
		Queuex<String> queue = new Queuex<String>();
		queue.toQueue("1: 1");
		queue.toQueue("2: 2");
		queue.toQueue("3: 3");
		System.out.println(queue.getSize());
		System.out.println(queue.toString());
		System.out.println("First position: " + queue.spy());
	}

}
