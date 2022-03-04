package com.AirlinTravel.AirlineProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.AirlinTravel.AirlineProject.model.UserEntity;
import com.AirlinTravel.AirlineProject.repository.UserRepository;


@org.springframework.stereotype.Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserEntity saveBook(UserEntity r) {
		return userRepository.save(r);
	}
	public List<UserEntity> getallusers() {
		return userRepository.findAll();
	}
	 public UserEntity updateBook(UserEntity b) {
	        if(userRepository.existsById(b.getName())) {
	            return userRepository.save(b); // save if id not found, edit where id is found
	        } else {
	            throw new RuntimeException("Invalid id, update operation failed");
	        }
	    }

	    public boolean deleteUser(String Name) {
	        boolean isFound = userRepository.existsById(Name);
	        userRepository.deleteById(Name);
	        return isFound;
	    }

}
