package com.ustglobal.demo;

public class Super {

	public Number test() {
		return new Integer(10);
	}
}

class sub extends Super {

	@Override
	public Integer test() {
		return new Integer(10);
	}
}
