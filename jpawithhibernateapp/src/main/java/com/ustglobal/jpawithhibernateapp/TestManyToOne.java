package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytoone.Pencil;
import com.ustglobal.jpawithhibernateapp.manytoone.PencilBox;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

public class TestManyToOne {
	
	public static void main(String[] args) {
		
		
		PencilBox box = new PencilBox();
	    box.setBid(1);
	    box.setBname("Apsara");
	    
	    Pencil pencil = new Pencil();
	    pencil.setPid(11);
	    pencil.setColor("black");
	    pencil.setPencilBox(box);
	    
	    Pencil pencil1 = new Pencil();
	    pencil1.setPid(12);
	    pencil1.setColor("Gray");
	    pencil1.setPencilBox(box);

	    
		EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory = null;
		EntityTransaction entityTransaction = null;
		try {
		    entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction =entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(pencil);
			entityManager.persist(pencil1);
			//VoterCard vCard = entityManager.find(VoterCard.class, 20);
			//System.out.println(vCard.getPerson().getPid());
			//entityManager.persist(p);
			System.out.println("Record saved");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
		
		}
	}
