package com.lti;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie 
{
	@Id @GeneratedValue
	int id;
	
	String name;
	
	@ManyToMany(mappedBy="movies",cascade=CascadeType.PERSIST,fetch=FetchType.EAGER)
	Set<SuperHero> heros=new HashSet<SuperHero>();
	
	
	public Movie()
	{
		
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public Set<SuperHero> getHeros() 
	{
		return heros;
	}

	public void setHeros(Set<SuperHero> heros) 
	{
		this.heros = heros;
	}
	
	
	
	
	
	
}
