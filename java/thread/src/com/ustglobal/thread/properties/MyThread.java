package com.ustglobal.thread.properties;

public class MyThread extends Thread {

	public static void main(String[] args) {

		System.out.println("Main started");

		String tname = Thread.currentThread().getName();
		System.out.println("Current Thread is " + tname);

		MyThread mt = new MyThread();
		String mname = mt.getName();
		System.out.println("My Thread Name is  : " + mname);

		Thread.currentThread().setName("Roopa");

		mt.setName("Kowsi");
		System.out.println("My Thread Name is  : " + mt.getName());

		System.out.println(10 / 0);

		/*
		 * try {
		 * 
		 * System.out.println(10/0);
		 * 
		 * } catch (ArithmeticException e) {
		 * 
		 * e.printStackTrace(); }
		 */
		System.out.println("Main ended");
	}

}
