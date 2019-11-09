package com.lti;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="super_hero")
public class SuperHero 
{
	@Id @GeneratedValue
	int id;
	String name;
	
	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.PERSIST)
	@JoinTable(
			name="superhero_movies",
			joinColumns={@JoinColumn(name="superhero_id")},
			inverseJoinColumns={@JoinColumn(name="movie_id")}
			)
	Set<Movie> movies=new HashSet<Movie>();
	
	
	
	public SuperHero()
	{


	}
	public SuperHero(int id, String name)
	{
		super();
		this.id = id;
		this.name = name;
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
	public Set<Movie> getMovies() 
	{
		return movies;
	}
	public void setMovies(Set<Movie> movies) 
	{
		this.movies = movies;
	}
	
	
	
	
	
}
