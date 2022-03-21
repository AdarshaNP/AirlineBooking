package com.AirlinTravel.AirlineProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AirlinTravel.AirlineProject.model.User;
import com.AirlinTravel.AirlineProject.service.UserService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/UserRegisteration")
	public String UserRegistered(@RequestBody User a) {
		userService.saveBook(a);
		return "true";
	}

	@GetMapping("/UserRegisteration")
	public List<User> users() {
		return userService.getallusers();
	}

	@PutMapping("/UserRegisteration")
	public User updateUser(@RequestBody User ud) {
		return userService.updateBook(ud);
	}

	@DeleteMapping("/UserRegisteration/{Name}")
	public boolean updateUser(@PathVariable String Name) {
		return userService.deleteUser(Name);
	}

}
