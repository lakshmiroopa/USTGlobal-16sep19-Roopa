package com.ustglobal.jpawithhibernateapp2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp2.dto.Employee;

public class InsertDemo {
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setEid(1);
		employee.setEname("Roopa");
		employee.setSalary(300000);
		
		EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory = null;
		EntityTransaction entityTransaction = null;
		
		try {
			
			 entityManagerFactory = Persistence.createEntityManagerFactory("test");
				entityManager = entityManagerFactory.createEntityManager();
				entityTransaction =entityManager.getTransaction();
				entityTransaction.begin();
				entityManager.persist(employee);
				System.out.println("Record saved");
				entityTransaction.commit();			
			
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
			
		}
		
		entityManager.close();
	}
	
}
