package com.multithreading;

public class Shared1 {

	synchronized void waitMethod() {
		Thread t = Thread.currentThread();
		
		System.out.println(t.getName()+"is relasing the lock and going to wait");
		
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t.getName()+"has been notifed lock back");
	}
	
	synchronized void notifyOneThread() {
		Thread t = Thread.currentThread();
		
		notify();
		
		System.out.println(t.getName()+"has been notifed one thread for the object");
	}
}

class mainClass1{
	public static void main(String[] args) {
		
		final Shared1 s = new Shared1();
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				s.waitMethod();
			}
		};
		t1.start();
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				s.waitMethod();
			}
		};
		t2.start();
		
		Thread t3 = new Thread() {
			@Override
			public void run() {
				s.waitMethod();
			}	
		};
		t3.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread t4= new Thread() {
			public void run() {
				s.notifyOneThread();
			}
		};
		t4.start();
	}
}
