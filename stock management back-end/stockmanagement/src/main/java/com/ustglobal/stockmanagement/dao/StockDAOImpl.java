package com.ustglobal.stockmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.stockmanagement.dto.Products;

@Repository
public class StockDAOImpl implements StockDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addProduct(Products product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public boolean modifyProduct(Products product) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Products products = manager.find(Products.class, product.getId());
		products.setName(products.getName());
		products.setCategory(products.getCategory());
		products.setCompany(products.getCompany());
		products.setQuantity(products.getQuantity());
		products.setPrice(products.getPrice());
		transaction.commit();
		return true;

	}

	@Override
	public Products searchProductById(int id) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(Products.class, id);
	}

	@Override
	public Products searchProductByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from Products where name=:name";
			TypedQuery<Products> typedQuery = manager.createQuery(jpql, Products.class);
			typedQuery.setParameter("name", name);
			Products product = typedQuery.getSingleResult();
			return product;
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Products> searchProductByCategory(String category) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Products where category=:category";
		TypedQuery<Products> typedQuery = manager.createQuery(jpql, Products.class);
		typedQuery.setParameter("category", category);
		return typedQuery.getResultList();
	}

	@Override
	public List<Products> getAllProducts() {
		String jpql = "from Products";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Products> query = manager.createQuery(jpql, Products.class);		
		List<Products> products = query.getResultList();
		return products;

	}
	

}
