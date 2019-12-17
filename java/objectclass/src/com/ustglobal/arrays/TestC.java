package com.ustglobal.arrays;

public class TestC {
	public static void main(String[] args) {
	
	   Student s = new Student(1,"ram",500000);
	   Student s1 = new Student(2,"anar",49999);
	   Student s2 = new Student(3,"arya",479300);
	   
	   Student[] students = new Student[3];
	   students[0] = s;
	   students[1] = s1;
	   students[2] = s2;
	   
   }

	for(

	Student s3:students)
	{
		System.out.println(s3);
	}

	static void receive(Student[] stu) {
		   for(Student s4 : stu ) {
			   System.out.println(s4);
		   }
	   }

}
