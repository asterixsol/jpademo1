package com.lti;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarJPADemo {

	public static void main(String[] args) 
	{

		try
		{
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("myPu");
			EntityManager manager=factory.createEntityManager();
			EntityTransaction tx=manager.getTransaction();
			
			
			Car c=new Car();
			c.setId(99);
			c.setName("City");
			c.setCompany("Honda");
			c.setColor("White");
			c.setHorsePower(1000.00f);
			c.setPrice(1000000.00f);
			c.setLaunchDate("20-Dec-17");
			
			tx.begin();
			manager.persist(c);
			tx.commit();
			
			System.out.println("Car Stored");
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


	}

}
