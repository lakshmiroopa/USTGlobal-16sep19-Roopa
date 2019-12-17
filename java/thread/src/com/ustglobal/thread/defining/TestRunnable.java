package com.ustglobal.thread.defining;

public class TestRunnable {

	public static void main(String[] args) {

		System.out.println("Main started");

		MyRunnable mr = new MyRunnable();

		// mr.start() is not defined in Runnable interface. So we have to create the
		// object of Thread class.
		// Because Thread has start().

		Thread t1 = new Thread(mr);

		t1.start();

		for (int i = 0; i < 10; i++) {

			System.out.println("Main thread");

		}

	}

}
