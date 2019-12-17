package com.ustglobal.immutable;

public class TestA {

	public static void main(String[] args) {

		MyString ms1 = new MyString(97, "roopa");
		System.out.println(ms1.getRollno());
		System.out.println(ms1.getName());
		System.out.println(ms1.changeContent(98, "kowsi"));

		MyString ms2 = new MyString(97, "roopa");
		System.out.println(ms2.getRollno());
		System.out.println(ms2.getName());
		System.out.println(ms2.changeContent(98, "kowsi"));
	}

}
