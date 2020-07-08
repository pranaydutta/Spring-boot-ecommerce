package com.sb.ec.bs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.ec.bs.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
