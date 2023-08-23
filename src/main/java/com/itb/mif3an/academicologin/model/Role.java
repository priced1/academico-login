package com.itb.mif3an.academicologin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="roles")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	
	public Role() {
		
	}
	
	
	public Role(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	public Role(String name) {
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long Id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
