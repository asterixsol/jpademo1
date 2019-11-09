package com.lti;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarJPADemoFetch {

	public static void main(String[] args) 
	{

		try
		{
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("myPu");
			EntityManager manager=factory.createEntityManager();
			EntityTransaction tx=manager.getTransaction();
			
			
			Car c=manager.find(Car.class,new Integer(1));
			
			System.out.println("Before Update:"+c);
			tx.begin();
			c.setPrice(10001.00f);
			c.setLaunchDate("15-Jun-19");
			tx.commit();
			
			c=null;
			c=manager.find(Car.class,new Integer(1));
			System.out.println(""+c);
			
			Car c1=manager.find(Car.class,new Integer(99));
			System.out.println("Before Update:"+c1);
			tx.begin();
			manager.remove(c1);
			tx.commit();
			
			c1=manager.find(Car.class,new Integer(99));
			System.out.println("Before Update:"+c1);
			
			
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


	}

}
