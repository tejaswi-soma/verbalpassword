package com.password.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.password.model.UserCredentials;
import com.password.service.UserService;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/add/{accountNumber}")
	public ResponseEntity<ResponseEntity<UserCredentials>> creatingProfile(@PathVariable("accountNumber") int accountNum){
		
		ResponseEntity<UserCredentials> response = userService.profile(accountNum);
		
		//return new ResponseEntity<>(response,HttpStatus.OK);
	return	ResponseEntity.ok().body(response);
	}
	
	
}
