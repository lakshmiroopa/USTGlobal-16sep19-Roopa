package com.ustglobal.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class InsertJpqlQuery {
	
	public static void main(String[] args) {
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		    entityManager = entityManagerFactory.createEntityManager();
		    entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			String jpql = "insert into Product(pid,pname,quantity) values(:id,:name,:quantity)";
			Query query = entityManager.createNativeQuery(jpql);
			query.setParameter("id", 10);
			query.setParameter("name", "Camera");
			query.setParameter("quantity", 10);			
			int result = query.executeUpdate();
			System.out.println(result);
			System.out.println("Inserted");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
			
		} finally {
			entityManager.close();
			
		}


}
}