package com.ustglobal.singleton;

public class MySingleton {

	private static MySingleton instance = null;
	String s;

	private MySingleton(String s) {
		this.s = s;
	}

	public static MySingleton getDbConnection() {

		if (instance == null) {
			instance = new MySingleton("roopa");
			return instance;
		} else {
			return instance;
		}
	}

}
