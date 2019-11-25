package com.ustglobal.jpawithhibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytomany.Course;
import com.ustglobal.jpawithhibernateapp.manytomany.Student;

public class TestManyToMany {
	
	public static void main(String[] args) {
		
		Course course = new Course();
		course.setCid(10);
		course.setCname("Java");
		
		Course course1 = new Course();
		course1.setCid(20);
		course1.setCname("Python");
		
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(course);
		courses.add(course1);
	
		Student s = new Student();
		s.setSid(1);
		s.setSname("Roopa");
		s.setCourse(courses);
		
		EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory = null;
		EntityTransaction entityTransaction = null;
		try {
		    entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction =entityManager.getTransaction();
			entityTransaction.begin();
			System.out.println("Record saved");
			entityManager.persist(s);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}


}
