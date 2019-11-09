package com.lti.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.lti.CD;
import com.lti.Musician;
import com.lti.db.DatabaseConnector;
import com.lti.services.CDService;
import com.lti.util.DateWorker;

public class CDRunner
{
	
	public static void main(String[] args)
	{
		DatabaseConnector db=new DatabaseConnector();
		EntityManager em=db.getEntityManager();
		EntityTransaction tx=em.getTransaction();
		
		CDService service=new CDService(em);
		
		/*Musician m=new Musician(2,"AR","Rehamn","Awesome", DateWorker.formatDate("12-01-1975"), 45,"Keyboard");
		tx.begin();
		em.persist(m);
		tx.commit();*/
		//m=em.merge(m);
		//CD cd=new CD("AR Rehman Hits1",200.35f,"Classical",null);
		
		/*System.out.println("\n\n-------------------Persist--------------");
		tx.begin();
		service.createCD(cd);
		tx.commit();
		
		System.out.println("\n\n-------------------Persist with connected values--------------");
		tx.begin();
		
		List<Musician> list=new ArrayList<Musician>();
		list.add(new Musician("AR", "Rehman"));
		list.add(new Musician("Shankar Ehasan","Loy"));
		list.add(new Musician("Himesh","Reshamiya"));
		
		CD cd1=new CD("Multi Singers", 250.35f,"Bollywood",list);
		
		cd1=service.createCD(cd1);
		tx.commit();
		
		System.out.println("\n\n-------------------Update with connected values--------------");
		CD cd2=service.findCD("Multi Singers");
		
		List<Musician> list=cd2.getMusician();
		tx.begin();
		
		list.clear();
		list.add(new Musician("A","B"));
		cd2.setMusician(list);
		tx.commit();
		*/
		
		System.out.println("\n\n-------------------------Loading Scenarios-----------");
		
		CD cd3=service.findCD("Multi Singers");
		System.out.println(cd3);
		
		
		
		
	}

}
