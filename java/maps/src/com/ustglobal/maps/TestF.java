package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {

	public static void main(String[] args) {

		Student s1 = new Student(2, "divya", 67.89);
		Student s2 = new Student(4, "roopa", 56.34);
		Student s3 = new Student(1, "kowsi", 98.99);
		Student s4 = new Student(3, "magi", 98.88);
		Student s5 = new Student(5, "raji", 96.88);
		Student s6 = new Student(9, "ramya", 68.88);
		Student s7 = new Student(7, "kiran", 78.88);
		Student s8 = new Student(8, "vijay", 99.88);
		Student s9 = new Student(6, "ram", 99.99);

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);

		ArrayList<Student> list2 = new ArrayList<Student>();
		list2.add(s4);
		list2.add(s5);
		list2.add(s6);

		ArrayList<Student> list3 = new ArrayList<Student>();
		list3.add(s7);
		list3.add(s8);
		list3.add(s9);

		HashMap<String, ArrayList<Student>> hm = new HashMap<>();
		hm.put("first", list);
		hm.put("second", list2);
		hm.put("third", list3);

		ArrayList<Student> first = hm.get("second");
		Iterator<Student> it = first.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is : " + s.id);
			System.out.println("Name is : " + s.name);
			System.out.println("Percentage3 is :  " + s.percentage);
			System.out.println("================================");
		}

	}

}
