package com.multithreading;

public class Thread1 extends Thread{
  
	@Override
	public void run() {
		for(int i=0; i<=10000;i++) {
			
			System.out.println(i);
		}
		try {
			Thread1.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
