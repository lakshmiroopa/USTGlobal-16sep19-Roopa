package com.ustglobal.objectclass;

public class TestG {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "sindhu", 10000.00);
		Employee e2 = new Employee(2, "roopa", 2000.00);
		Employee e3 = new Employee(3, "kowsi", 30000.00);
		Employee e4 = e3;

		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e3.equals(e4));
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		System.out.println(e4.toString());
	}

}
