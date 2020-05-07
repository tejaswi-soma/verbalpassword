package com.password.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.password.exception.UserNotFoundException;
import com.password.model.UserCredentials;
import com.password.repository.UserRespository;

@Service
public class UserService {

	@Autowired
	UserCredentials userCredentials;
	
	@Autowired
	UserRespository userRepo;
	
	public UserCredentials profile(int accountNum) throws UserNotFoundException{
		
		
			
			Optional<UserCredentials> list = userRepo.findById(accountNum);
			if(accountNum!=0) {
			return list.get();
		}
		
		else {
		
			throw new UserNotFoundException();
		}
		
	}
}