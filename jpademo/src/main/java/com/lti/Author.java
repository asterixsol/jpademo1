package com.lti;

import java.security.Permissions;
import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Transient;

@Entity
public class Author 
{
	@Id
	int id;
	
	@Column(name="first_name")
	String firstName;
	
	@Column(name="last_name")
	String lastName;
	String bio;
	
	@Column(name="date_of_birth")
	LocalDate dateOfBirth;
	
	@Transient
	int age;
	
	public Author()
	{
		
	}

	public Author(int id, String firstName, String lastName, String bio, LocalDate dateOfBirth, int age)
	{
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.bio = bio;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
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

	@Override
	public String toString() {
		return "Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", bio=" + bio
				+ ", dateOfBirth=" + dateOfBirth + ", age=" + age + "]";
	}
	
	
	@PrePersist
	@PreUpdate
	private void validate()
	{
		if(firstName==null || "".equals(firstName))
		{
			throw new IllegalArgumentException("First Name is invalid");
		}
		if(lastName==null || "".equals(lastName))
		{
			throw new IllegalArgumentException("First Name is invalid");
		}
		
		
	}
	
	
	@PostLoad
	@PostPersist
	@PostUpdate
	public void calculateAge()
	{
		age=Period.between(dateOfBirth, LocalDate.now()).getYears();
		System.out.println("Hey this from Post annotations: Age is "+age);
	}
	
	

}
