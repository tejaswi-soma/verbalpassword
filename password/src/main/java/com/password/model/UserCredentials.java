package com.password.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="DETAILS_BOX")
@Component
public class UserCredentials  {
	
	@Id
	int accountNumber;
    String name;
	String password;
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public UserCredentials() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserCredentials(int accountNumber, String name, String password) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.password = password;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
