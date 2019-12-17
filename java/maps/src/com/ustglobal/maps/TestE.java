package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {

	public static void main(String[] args) {

		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();

		tm.put("Bangalore", 560068);
		tm.put("Hariyana", 134203);
		tm.put("kandukur", 523105);
		// tm.put(null, 423527372); NullPointerException.
		for (Map.Entry<String, Integer> m : tm.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("Key  is : " + key);
			System.out.println("Value is : " + value);
			System.out.println("======================");
		}

	}

}
