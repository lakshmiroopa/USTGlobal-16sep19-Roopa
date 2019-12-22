package com.ustglobal.librarymanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.librarymanagement.dto.BooksDetails;
import com.ustglobal.librarymanagement.dto.BooksRegistration;
import com.ustglobal.librarymanagement.dto.BooksTransaction;
import com.ustglobal.librarymanagement.dto.User;


@Repository
public class LibraryDAOImpl implements LibraryDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public User login(String email, String password) {
		String jpql = "from User where email=:email and password=:password";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<User> query = manager.createQuery(jpql, User.class);
		query.setParameter("email", email);
		query.setParameter("password", password);
		try {
			User user = query.getSingleResult();
			return user;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public User registerUser(User user) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(user);
			transaction.commit();
			return user;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/*
	 * @Override public boolean requestBook(int bid) { EntityManager manager =
	 * factory.createEntityManager(); BooksDetails booksDetails =
	 * manager.find(BooksDetails.class, bid); return booksDetails; }
	 */
	@Override
	public List<BooksDetails> showAllBooks() {
		String jpql = "from BooksDetails";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<BooksDetails> query = manager.createQuery(jpql, BooksDetails.class);
		List<BooksDetails> booksDetails = query.getResultList();
		return booksDetails;

	}

	@Override
	public User getStudentInfo(int id) {
		EntityManager manager = factory.createEntityManager();
		User bean = manager.find(User.class, id);
		return bean;

	}

	@Override
	public boolean deleteStudent(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		User bean = manager.find(User.class, id);
		if (bean != null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public BooksDetails addBooks(BooksDetails booksDetails) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {
			transaction.begin();
			manager.persist(booksDetails);
			transaction.commit();
			return booksDetails;
		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}

	@Override
	public boolean deleteBook(int bid) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		BooksDetails bean = manager.find(BooksDetails.class, bid);
		if (bean != null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		} else {
			transaction.rollback();
			return false;
		}
	}

	@Override
	public List<BooksRegistration> viewRequest() {
		// TODO Auto-generated method stub
		return null;
	}
//	
	@Override
	public BooksDetails searchBook(String bookName) {
		EntityManager manager = factory.createEntityManager();
		BooksDetails bean = manager.find(BooksDetails.class, bookName);
		return bean;
	}
	@Override
	public boolean updateBook(BooksDetails bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		BooksDetails bookBean = manager.find(BooksDetails.class, bean.getBid());
		bookBean.setBookName(bean.getBookName());
		bookBean.setAuthor1(bean.getAuthor1());
		bookBean.setAuthor2(bean.getAuthor2());
		bookBean.setPublisher(bean.getPublisher());
		bookBean.setYearOfPublication(bean.getYearOfPublication());
		transaction.commit();		
		transaction.rollback();
		return true;
	}

	@Override
	public boolean requestBook(int id, int bid) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			User user = manager.find(User.class, id);
			BooksDetails booksDetails = manager.find(BooksDetails.class, bid);
			BooksTransaction issue = new BooksTransaction();			
//			issue.setIssueDate(null);
//			issue.setReturnDate(null);
			issue.setBook(booksDetails);
			issue.setUser(user);
			manager.persist(issue);
			transaction.commit();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
}
