package com.ustglobal.thread.properties;

public class MyPriorityThread extends Thread {

	public static void main(String[] args) {

		System.out.println("Main started");

		int p = Thread.currentThread().getPriority();
		System.out.println(" Main Thread priority is : " + p);

		Thread.currentThread().setPriority(10);
		System.out.println("Main thread priority is : " + Thread.currentThread().getPriority());

		MyPriorityThread mpt = new MyPriorityThread();
		int q = mpt.getPriority();
		System.out.println(" My Priority Thread priority is : " + p);

		mpt.setPriority(10);
		System.out.println("MyThread priority is : " + mpt.getPriority());

		Thread.currentThread().setPriority(10);
		System.out.println("MyPriority thread priority is : " + Thread.currentThread().getPriority());

		System.out.println("Main ended");
	}
}
