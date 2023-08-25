package com.itb.mif3an.academicologin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itb.mif3an.academicologin.model.User;
import com.itb.mif3an.academicologin.repository.UserRepository;
import com.itb.mif3an.academicologin.web.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User save(UserDto userDto) {
		// TODO Auto-generated method stub
		
		User user = new User(userDto.getFirstName(), 
							userDto.getLastName(), 
							userDto.getEmail(), 
							userDto.getPassword());
		
		
		
		return userRepository.save(user);
	}

}
