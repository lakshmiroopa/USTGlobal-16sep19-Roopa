package com.ustglobal.arrays;

public class TestA {

	public static void main(String[] args) {

		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// for(data_type variable : array/collection){}

		System.out.println("--------------------------------");

		for (int i : a) {
			System.out.println(i);
		}

		System.out.println("--------------------------------");
		char ch[] = { 'a', 'b', 'c', 'd' };
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		System.out.println("--------------------------------");

		for (int i : ch) {
			System.out.println(i);
		}
		System.out.println("--------------------------------");

		boolean[] b = { true, false, true, false };
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		System.out.println("------------------");

		String s[] = { "aishu", "roopa", "kowsi", "magi" };
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

		System.out.println("-------------------");

		for (String i : s) {
			System.out.println(i);
		}

	}

}