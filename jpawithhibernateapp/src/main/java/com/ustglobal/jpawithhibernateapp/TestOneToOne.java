package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetoone.Person;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

public class TestOneToOne {
	
	public static void main(String[] args) {
	
			
			VoterCard vc = new VoterCard();
			vc.setVid(30);
			vc.setVname("Magi");
			
			Person p = new Person();
			p.setPid(30);
			p.setPname("Magi");
			p.setVoterCard(vc);
			
			EntityManager entityManager = null;
			EntityManagerFactory entityManagerFactory = null;
			EntityTransaction entityTransaction = null;
			try {
			    entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
				entityManager = entityManagerFactory.createEntityManager();
				entityTransaction =entityManager.getTransaction();
				entityTransaction.begin();
				VoterCard vCard = entityManager.find(VoterCard.class, 20);
				System.out.println(vCard.getPerson().getPid());
				//entityManager.persist(p);
				System.out.println("Record saved");
				entityTransaction.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}
			entityManager.close();
			
			}

	}

