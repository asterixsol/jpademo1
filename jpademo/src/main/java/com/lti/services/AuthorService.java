package com.lti.services;

import javax.persistence.EntityManager;

import com.lti.Author;

public class AuthorService 
{
	EntityManager em;
	
	public AuthorService(EntityManager em) 
	{
		this.em=em;
	}
	
	public Author createAuthor(Author a)
	{
		em.persist(a);
		return a;
	}
	
	public void removeAuthor(Author a)
	{
		a=em.merge(a);
		em.remove(a);
	}
	
	public Author findAuthor(int id)
	{
		Author a=em.find(Author.class,new Integer(id));
		return a;
	}
}
