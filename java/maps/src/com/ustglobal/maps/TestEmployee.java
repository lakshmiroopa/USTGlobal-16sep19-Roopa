package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(2, "divya", 679989);
		Employee e2 = new Employee(4, "roopa", 56.34);
		Employee e3 = new Employee(1, "kowsi", 98.99);
		Employee e4 = new Employee(3, "magi", 98.88);
		Employee e5 = new Employee(5, "raji", 96.88);
		Employee e6 = new Employee(9, "ramya", 68.88);
		Employee e7 = new Employee(7, "kiran", 78.88);
		Employee e8 = new Employee(8, "vijay", 99.88);
		Employee e9 = new Employee(6, "ram", 99.99);

		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);

		ArrayList<Employee> list2 = new ArrayList<Employee>();
		list2.add(e4);
		list2.add(e5);
		list2.add(e6);

		ArrayList<Employee> list3 = new ArrayList<Employee>();
		list3.add(e7);
		list3.add(e8);
		list3.add(e9);

		HashMap<String, ArrayList<Employee>> hm = new HashMap<>();
		hm.put("first", list);
		hm.put("second", list2);
		hm.put("third", list3);

		ArrayList<Employee> first = hm.get("first");
		Iterator<Employee> it = first.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is : " + e.id);
			System.out.println("Name is : " + e.name);
			System.out.println("Percentage3 is :  " + e.salary);
			System.out.println("================================");
		}

	}

}
