package com.javaex.ex03;

public class Ex01 {
	public static void main(String[] args) throws InterruptedException {
		//출장 1-20

		//DigitRunableImpl dt= new DigitRunableImpl();

		Thread thread = new Thread(new DigitRunableImpl());
		thread.start();
		
		for(char ch = 'A'; ch<='Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}

	}
}