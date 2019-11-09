package com.lti;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Musician
{
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@Column(name="first_name",length=50)
	String firstName;
	
	@Column(name="last_name",length=50)
	String lastName;
	
	@Column(length=500)
	String bio;
	
	@Column(name="date_of_birth")
	LocalDate dateOfBirth;
	
	@Transient
	int age;
	
	@Column(name="preferred_instrument")
	String preferredInstrument;
	
	
	
	public Musician()
	{
		
	}
	
	public Musician(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
	}


	
	public Musician(int id, String firstName, String lastName, String bio, LocalDate dateOfBirth, int age,
			String preferredInstrument) 
	{
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.bio = bio;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.preferredInstrument = preferredInstrument;
	}


	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getBio() {
		return bio;
	}



	public void setBio(String bio) {
		this.bio = bio;
	}



	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getPreferredInstrument() {
		return preferredInstrument;
	}



	public void setPreferredInstrument(String preferredInstrument) {
		this.preferredInstrument = preferredInstrument;
	}



	@Override
	public String toString() {
		return "Musician [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", bio=" + bio
				+ ", dateOfBirth=" + dateOfBirth + ", age=" + age + ", preferredInstrument=" + preferredInstrument
				+ "]";
	}
	
	
	
	
	
	
}
