package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {

	public static void main(String[] args) {

		HashMap hm = new HashMap();

		hm.put("roopa", 889278299);
		hm.put("magi", 987364784);
		hm.put("yammu", 963473833);
		hm.put(null, 99906754);
		hm.put(null, 906754);

		System.out.println("Data " + hm);
		hm.put("roopa", 9518882);
		System.out.println("Data " + hm);
		hm.put("kowsi", 9518882);
		System.out.println("Data " + hm);

		Object phnno = hm.get("roopa");
		System.out.println("value " + phnno);

		Object phnno1 = hm.get("roopali");
		System.out.println("value " + phnno1);

		Object value = hm.remove("roopa");
		System.out.println("Value " + value);

		System.out.println("After remove " + hm);

	}

}
