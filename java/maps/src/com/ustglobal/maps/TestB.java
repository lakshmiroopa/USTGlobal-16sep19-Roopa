package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {

	public static void main(String[] args) {

		HashMap hm = new HashMap();

		hm.put("roopa", 889278299);
		hm.put("magi", 987364784);
		hm.put("yammu", 963473833);

		HashMap hm1 = new HashMap();
		hm1.put("deepu", 13234);
		hm1.put("riya", 234515);
		hm1.put("kriti", 12345432);

		boolean b = hm1.containsKey("deepu");
		System.out.println("Has key " + b);

		boolean b1 = hm1.containsValue(12345432);
		System.out.println("Has value " + b1);

		hm.putAll(hm1);
		System.out.println("====================");

		System.out.println("After put all " + hm);

		System.out.println("Size of the hash map " + hm.size());

		boolean b2 = hm.isEmpty();
		System.out.println("empty or not: " + b2);

		hm.clear();
		System.out.println(hm);
	}
}
