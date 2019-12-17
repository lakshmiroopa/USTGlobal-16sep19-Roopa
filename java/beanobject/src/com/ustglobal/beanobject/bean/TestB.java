package com.ustglobal.beanobject.bean;

import java.util.Scanner;

public class TestB {
	public static void main(String[] args) {

		System.out.println("Scanner class");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter age");
		int age = scn.nextInt();
		System.out.println("Age is " + age);

		System.out.println("enter name");
		String name = scn.next();
		System.out.println(name);

		System.out.println("enter name");
		String name1 = scn.nextLine();
		System.out.println(name1);

		scn.close();

	}

}
