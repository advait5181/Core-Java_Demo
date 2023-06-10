package com.multithreading;

class Shared{
	int i;
	synchronized void sharedMethod() {
		Thread t = Thread.currentThread();
		
		for(i=0;i<=50;i++) {
			System.out.println(t.getName()+" "+i);
		}
	}
}
public class JavaThreadSynchronization {
 
	public static void main(String[] args) {
		
		final Shared s1 = new Shared();
		
		Thread t1 = new Thread("my_Thread") {
			public void run() {
				s1.sharedMethod();
			}
		};
	
		Thread t2 = new Thread("my_Thread2") {
			public void run() {
				s1.sharedMethod();
			}
		};
		
		t1.start();
		t2.start();
	}
}
