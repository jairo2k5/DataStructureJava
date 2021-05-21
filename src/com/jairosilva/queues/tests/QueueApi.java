package com.jairosilva.queues.tests;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApi {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("1:1");
		queue.add("2:2");
		queue.add("3:3");
		queue.add("4:4");
		queue.add("5:5");
		System.out.println(queue.toString());
		System.out.println(queue.peek());
		queue.remove();
		System.out.println(queue.toString());
		System.out.println(queue.peek());
	}

}
