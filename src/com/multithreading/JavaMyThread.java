package com.multithreading;

public class JavaMyThread {

	public static void main(String[] args) {
		
		MyThread myThread = new MyThread("my_thread");
		
		myThread.start();
		
		System.out.println(myThread.getName());
		
	}
}
