package com.itb.mif3an.academicologin.web.dto;

import java.util.List;

import com.itb.mif3an.academicologin.model.Endereco;


public class UserDto {
	
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	private List<Endereco> enderecos;
	
	public UserDto() {
		
	}

	public UserDto(String firstName, String lastName, String email, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public UserDto(String firstName, String lastName, String email, String password, List<Endereco> enderecos) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.enderecos = enderecos;
	}
	

}
