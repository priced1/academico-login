package com.itb.mif3an.academicologin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))

public class User {
	private Long id;
	
	//private String firstName
	//private String lastName;
	//private String email;
	//private String password;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto-incremento
	private String firstName, lastName, email, password;
	
	 //private : acesso dentro da propria classe
	 //public: acesso livre a todas as classes
	 //protected: acesso liberado dentro para as classes filhas (herança)
	
	public void setId(Long id) {
		this.id = id; 
	}
	
	public Long getId() {
		return id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

