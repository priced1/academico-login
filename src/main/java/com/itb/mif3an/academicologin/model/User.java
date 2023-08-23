package com.itb.mif3an.academicologin.model;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))

public class User {
	
	
	//private : acesso dentro da propria classe
		 //public: acesso livre a todas as classes
		 //protected: acesso liberado dentro para as classes filhas (herança)
		
		//GenerationType.AUTO  
		//valor padrão ( deixapara o provedor escolher a estrategia mais adequada) 
		
		//GenerationType.SEQUENCE
		// Informamos ao provedor a sequencia a ser seguida, caso não o provedor escolherá a sequencia.
		
		//GenerationType.TABLE 
		//Criamos uma tabela para gerenciar as chaves primárias, não há suporte para todos
		//os provedores 
	
	@Id //PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto-incremento
	private Long id;
	
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	//1:N
	@OneToMany //um usuario para muitos endereços
	@JoinColumn(name="endereco_id") //chave estrangeira FK
	private List<Endereco> enderecos;
	

	//M:N
	@ManyToMany(fetch= FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name="users_roles",
			joinColumns= @JoinColumn(name="user_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name="role_id", referencedColumnName = "id")
			
			)
	private Collection<Role> roles;
	
	//construtor padrao: não possui parâmetros
	public User() {
		
	}
	
	
	public User(String firstName) {
		this.firstName = firstName;
	}
	
	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


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


	public List<Endereco> getEnderecos() {
		return enderecos;
	}


	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}


	public Collection<Role> getRoles() {
		return roles;
	}


	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	
}

