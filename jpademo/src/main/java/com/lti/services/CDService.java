package com.lti.services;

import javax.persistence.EntityManager;

import com.lti.CD;

public class CDService 
{
	EntityManager em;
	
	public CDService(EntityManager em)
	{
		this.em=em;
	}
	
	public CD createCD(CD cd)
	{
		em.persist(cd);
		return cd;
	}
	
	public void removeCD(CD cd)
	{
		em.remove(em.merge(cd));
	}
	
	public CD findCD(String id)
	{
		CD cd=em.find(CD.class,id);
		return cd;
	}
	

}
