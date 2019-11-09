package com.lti;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.omg.CORBA.PERSIST_STORE;

@Entity
public class CD
{
	@Id
	String title;
	
	@Column(name="total_duration")
	float totalDuration;
	
	@Column(name="genre")
	String genre;
	
	@OneToMany(cascade=CascadeType.PERSIST,fetch=FetchType.EAGER)
	List<Musician> musician;
	
	
	public CD()
	{
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public float getTotalDuration() {
		return totalDuration;
	}


	public void setTotalDuration(float totalDuration) {
		this.totalDuration = totalDuration;
	}


	public String getGenre() {
		return genre;
	}
	
	


	


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public List<Musician> getMusician() {
		return musician;
	}


	public void setMusician(List<Musician> musician) {
		this.musician = musician;
	}


	public CD(String title, float totalDuration, String genre, List<Musician> musician) 
	{
		super();
		this.title = title;
		this.totalDuration = totalDuration;
		this.genre = genre;
		this.musician = musician;
	}
	
	
	@Override
	public String toString() {
		return "CD [title=" + title + ", totalDuration=" + totalDuration + ", genre=" + genre + ", musician=" + musician
				+ "]";
	}
	


	
}
