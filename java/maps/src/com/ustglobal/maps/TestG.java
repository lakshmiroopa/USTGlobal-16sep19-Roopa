package com.ustglobal.maps;

import java.util.Hashtable;

public class TestG {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(101, "ajay");
		ht.put(502, "vijay");
		ht.put(23, "sonu");
		ht.put(19, "monu");

		ht.put(101, "sriram");
		// ht.put(null,"vijay");
		// ht.put(104,null); No null for both key and avlues.

		System.out.println("Data is : " + ht);

	}

}
