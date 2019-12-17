package com.ustglobal.thread.pausing;

public class Slider {
	
	public static void main(String[] args) {
		
		System.out.println("Main strted");
		
		for (int i = 0; i < 5; i++) {
		
			System.out.println("sliding");
		}
		try {
			 
		     Thread.sleep(2000);
		     
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
		 
		for (int i = 0; i < 10; i++) {
				
			System.out.println("Main thread");
				
		}
			
		System.out.println("Main ended");
			
	}
	
}
