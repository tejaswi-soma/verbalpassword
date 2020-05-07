package com.password.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.password.model.UserCredentials;
import com.password.repository.UserRespository;

@Service
public class UserService {

	@Autowired
	UserCredentials userCredentials;
	
	@Autowired
	UserRespository userRepo;
	
	public ResponseEntity<UserCredentials> profile(int accountNum){
		
		if(accountNum!=0) {
			
			List<UserCredentials> list = new ArrayList<UserCredentials>();
			userRepo.findById(accountNum);
			//.get().getName();
			//forEach(list::add);
			
		
	
			//String name = userCredentials.getName();
			//String password = userCredentials.getPassword();
			
			//list.add(userCredentials.getName());
			//list.add(userCredentials.getPassword());
			return new ResponseEntity<UserCredentials>((UserCredentials) list,HttpStatus.OK);
		}
		
		else {
		
				return new ResponseEntity<UserCredentials>(HttpStatus.BAD_REQUEST);
		}
		
	}
}