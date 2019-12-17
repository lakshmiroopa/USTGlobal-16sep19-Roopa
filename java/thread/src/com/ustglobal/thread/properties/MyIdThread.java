package com.ustglobal.thread.properties;

public class MyIdThread extends Thread {

	public static void main(String[] args) {

		System.out.println("Main started");

		System.out.println(Thread.currentThread().getId());

		MyIdThread mi = new MyIdThread();
		System.out.println("My id thread is : " + mi.getId());

		System.out.println("Priority is : " + Thread.currentThread().getPriority());
		/*
		 * Thread.currentThread().setPriority(18);
		 * 
		 * It throws IllegalArgumentException.
		 * 
		 * If we are trying to give priority < 1 or > 10. Then it will throws Exception.
		 * 
		 */

		System.out.println("Main ended");
	}
}
