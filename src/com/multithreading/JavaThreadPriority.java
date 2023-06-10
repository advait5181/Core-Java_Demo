package com.multithreading;

public class JavaThreadPriority {

	public static void main(String[] args) {
	Thread t = Thread.currentThread();
	
     System.out.println(t.getPriority());
     
     t.setPriority(8);
     
     System.out.println(t.getPriority());
	}
}
