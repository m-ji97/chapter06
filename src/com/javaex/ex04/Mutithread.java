package com.javaex.ex04;

public class Mutithread {
	
	public static void main(String[] args) throws InterruptedException{
		
		Thread thread1 = new Thread(new Digitimpl());
		Thread thread2 = new Thread(new LowerImpl());
		Thread thread3 = new Thread(new UpperImpl());
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}