package com.javaex.ex04;

public class UpperImpl extends Thread{
	
	public void run() {
		
		for(char i = 'a'; i<='z'; i++) {
			System.out.println(i);
			try {
				Thread.sleep(900);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}