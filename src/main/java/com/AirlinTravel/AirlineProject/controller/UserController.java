package com.AirlinTravel.AirlineProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AirlinTravel.AirlineProject.model.UserEntity;
import com.AirlinTravel.AirlineProject.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/UserRegisteration")
	public String UserRegistered(@RequestBody UserEntity a) {
		userService.saveBook(a);
		return "registered successfully";
	}

	@GetMapping("/UserRegisteration")
	public List<UserEntity> users() {
		return userService.getallusers();
	}

	@PutMapping("/UserRegisteration")
	public UserEntity updateUser(@RequestBody UserEntity ud) {
		return userService.updateBook(ud);
	}

	@DeleteMapping("/UserRegisteration/{Name}")
	public boolean updateUser(@PathVariable String Name) {
		return userService.deleteUser(Name);
	}

}
