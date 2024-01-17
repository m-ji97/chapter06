package com.javaex.ex02;

public class UpperThread extends Thread {
	
	public void run() {
		for(char ch='a'; ch<='z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}