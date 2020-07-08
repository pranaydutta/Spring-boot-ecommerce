package com.sb.ec.bs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.ec.bs.model.User;
import com.sb.ec.bs.service.UserInterf;

@RestController
@RequestMapping("/user")
//@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	private UserInterf userService;
	
	@GetMapping("/findAllUsers")
	public List<User> findAllUsers()
	{
		return userService.findAllUsers();
	}
	
	@PostMapping("/createUser")
	public void createUser(@RequestBody User user)
	{
		userService.createUser(user);
	}
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") long id) {
		
		 userService.deleteUser(id);
	}
}
