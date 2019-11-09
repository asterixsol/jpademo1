package com.lti.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.lti.Author;
import com.lti.db.DatabaseConnector;
import com.lti.services.AuthorService;
import com.lti.util.DateWorker;

public class AuthorRunner
{
 
	public static void main(String[] args)
	{
		DatabaseConnector db=new DatabaseConnector();
		EntityManager em=db.getEntityManager();
		AuthorService service=new AuthorService(em);
		EntityTransaction tx=em.getTransaction();
		
		System.out.println("\n\n------------------Persist----------------------------");
		Author a=new Author(19,"Katthy","Sierra","Java Certified Author",DateWorker.formatDate("12-01-1985"), 35);
		
		tx.begin();
		System.out.println(service.createAuthor(a));		
		tx.commit();
		
		System.out.println("\n\n------------------Remove----------------------------");
		Author a1=service.findAuthor(102);
		System.out.println("Fetch Result:"+a1);
		
		tx.begin();
		service.removeAuthor(a1);
		tx.commit();
		
		a1=service.findAuthor(103);
		System.out.println("After Remove-Fetch Result:"+a1);
		System.out.println("\n\n------------------Update----------------------------");
		Author a2=service.findAuthor(103);
		System.out.println("Fetch Result:"+a2);
		
		tx.begin();
		a2=em.merge(a2);
		a2.setFirstName("Zartab");
		a2.setLastName("Nakhwa");
		tx.commit();
	
		a2=service.findAuthor(102);
		System.out.println("Fetch Result- after Update:"+a2);
		
	
		
		
		
	}
}
