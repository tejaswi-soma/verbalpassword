
  package com.password.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.password.model.UserCredentials;

@Repository
  public interface UserRespository extends CrudRepository<UserCredentials, Integer>{
  
  }
 