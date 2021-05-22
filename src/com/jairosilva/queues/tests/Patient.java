package com.jairosilva.queues.tests;

public class Patient implements Comparable<Patient> {
	private String name;
	private int priority;
	
	public Patient(String name, int priority) {
		super();
		this.name = name;
		this.priority = priority;
	}
	public Patient() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	@Override
	public int compareTo(Patient o) {
		if(this.priority > o.getPriority()) {
			return 1;
		} else if(this.priority < o.getPriority()) {
			return -1;
		}
		return 0;
	}
}
