package com.ustglobal.arrays;

public class TestB {

	public static void main(String[] args) {

		int[] a = { 19, 45, 748, 348, 477 };
		// System.out.println(a[9]);
		receive(a);
		int[] values = getArr();
		String s1[] = { "roopa", "kowsi", "magi" };
		receive(s);

	}

	static void receive(int[] b) {
		for (int a : b) {
			System.out.println(a);
		}
	}

	// HOW TO RETRN AN ARRAY

	static int[] getArr() {
		int[] values = { 20, 30, 40, 50 };
		return values;
	}

	static void receive(String[] s) {
		for (int s : s1) {
			System.out.println(s);
		}
	}

	static String[] getArray() {
		String[] values = { "roopa", "kowsi", "magi", "ram" };
		return values;
	}

}
