package com.ustglobal.beanobject.bean;

public class TestA {
	public static void main(String[] args) {

		Student s = new Student();
		s.setId(11);
		s.setName("roopa");
		s.setRollno(134);

		Database d = new Database();
		d.receive(s);

		Employee e = new Employee();
		e.setId(45);
		e.setSalary(100000);
		e.setName("roopa");
		e.setDept(1);
		e.setDesignation("software developer");

	}

}
