package com.sb.ec.bs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.ec.bs.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
