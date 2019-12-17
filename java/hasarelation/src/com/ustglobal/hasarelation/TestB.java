package com.ustglobal.hasarelation;

public class TestB {
	public static void main(String[] args) {
		Music m = new Music();
		System.out.println(m.name);
		System.out.println(m.color);
		m.play();
		m.c.start();
	}

}
