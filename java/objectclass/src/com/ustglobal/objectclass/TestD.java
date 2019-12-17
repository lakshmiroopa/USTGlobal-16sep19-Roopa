package com.ustglobal.objectclass;

public class TestD {

	public static void main(String[] args) {

		Student s = new Student(10, "roopa", 99.9);
		int code = s.hashCode();
		System.out.println(code);
		String s1 = s.toString();
		System.out.println(s1);
	}
}
