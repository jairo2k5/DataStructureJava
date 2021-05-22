package com.jairosilva.queues.tests;

import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueApi {

	public static void main(String[] args) {
		Queue<Patient> queue = new PriorityQueue<>(
			new Comparator<Patient>() {
				@Override
				public int compare(Patient o1, Patient o2) {
					return Integer.valueOf(o1.getPriority()).compareTo(o2.getPriority());
				}
			}
		);
		queue.add(new Patient("J", 1));
		queue.add(new Patient("O", 3));
		queue.add(new Patient("X", 2));
		System.out.println(queue);
	}

}
