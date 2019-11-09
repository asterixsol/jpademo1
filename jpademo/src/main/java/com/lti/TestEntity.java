package com.lti;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TestEntity {
	@Id 
	int id;
	
	
	String text;


	public TestEntity(int id, String text) {
		super();
		this.id = id;
		this.text = text;
	}


	public TestEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}
	
	
	

}
