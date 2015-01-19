package org.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Helper {

	public final static EntityManager init() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-tests"); 
		EntityManager em = emf.createEntityManager(); 
		return em;
	}

	public final static void finished(EntityManager em) {
		EntityManagerFactory emf = em.getEntityManagerFactory() ;
        em.close(); 
        emf.close();				
	}
}
