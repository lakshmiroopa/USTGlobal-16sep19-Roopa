package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReadJpqlQuery {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//All data
		
		/*
		 * String jpql = "from Product"; Query query = entityManager.createQuery(jpql);
		 * System.out.println(query.getResultList()); List<Product> product =
		 * query.getResultList(); for (Product productDetail : product) {
		 * 
		 * System.out.println("ID is : "+productDetail.getPid());
		 * System.out.println("Name : "+productDetail.getPname());
		 * System.out.println("Quantity is : "+productDetail.getQuantity());
		 * System.out.println("===========================");
		 * 
		 * }
		 */
		
		//only name
		
		/*
		 * String jpql = "select pname from Product "; Query query =
		 * entityManager.createQuery(jpql); System.out.println(query.getResultList());
		 * List<String> product = query.getResultList(); for (String Pname : product) {
		 * 
		 * System.out.println("Name : "+Pname); }
		 */
		
		
		entityManager.close();
		
	}
	

}
