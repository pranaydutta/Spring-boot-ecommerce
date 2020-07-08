package com.sb.ec.bs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.ec.bs.dao.UserRepository;
import com.sb.ec.bs.model.User;

@Service
public class UserService implements UserInterf{
	
	
	@Autowired
	private UserRepository repository;

	@Override
	public List<User> findAllUsers() {
		return repository.findAll();
	}

	public void createUser(User user) {
		
		repository.save(user);
	}

	@Override
	public void deleteUser(long id) {
		//User user = repository.getOne(id);
		repository.deleteById(id);
		
		
	}
	
	
	
	

}
