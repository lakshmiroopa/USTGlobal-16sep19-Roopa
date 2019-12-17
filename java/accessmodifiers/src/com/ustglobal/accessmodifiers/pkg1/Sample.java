package com.ustglobal.accessmodifiers.pkg1;

import com.ustglobal.accessmodifiers.pkg2.Demo;

public class Sample extends Demo {
	public static void main(String[] args) {
		Sample s = new Sample();
		Demo d = new Demo();
		System.out.println(d.name);
		d.div();

	}

}
