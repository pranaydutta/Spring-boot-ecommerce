package com.sb.ec.bs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sb.ec.bs.model.User;

@Service
public interface UserInterf {
	
	public List<User> findAllUsers();
	public void createUser(User user);
	public void deleteUser(long id);

}
