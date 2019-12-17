package com.ustglobal.objectclass;

public class TestE {

	public static void main(String[] args) {

		Car c = new Car(500000, "BMW", "black");
		String c11 = c.toString();
		System.out.println(c11);
		Car c2 = new Car(700000, "Benz", "gray");
		String c12 = c2.toString();
		System.out.println(c12);
		Car c3 = new Car(600000, "Audi", "white");
		String c13 = c3.toString();
		System.out.println(c13);
	}

}
