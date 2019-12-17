package com.ustglobal.thread.defining;

public class MainThread {

	public static void main(String[] args) {

		System.out.println("Main started");

		MyThread t1 = new MyThread();

		t1.start();

		/*
		 * t1.run();
		 * 
		 * don't call run(). because it behaves like a normal program. All code will be
		 * executed inside main thread only.
		 *
		 */

		for (int i = 0; i < 10; i++) {

			System.out.println("Main thread");

		}

		System.out.println("Main ended");
	}

}
