package com.ustglobal.singleton;

public class TestA {

	public static void main(String[] args) {

		MySingleton ms = MySingleton.getDbConnection();
		ms.s = "hello";

		System.out.println(ms.hashCode());

		MySingleton mx = MySingleton.getDbConnection();
		mx.s = "hi";

		System.out.println(mx.hashCode());
		System.out.println(ms.s);
		System.out.println(mx.s);

	}

}
