package com.ustglobal.objectclass;

public class TestA {
	public static void main(String[] args) {
		Mouse m = new Mouse();
		USBPort.connect(m);
		PenDrive p = new PenDrive();
		USBPort.connect(p);

	}
}