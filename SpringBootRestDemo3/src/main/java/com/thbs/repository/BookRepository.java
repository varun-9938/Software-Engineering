package com.thbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thbs.model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
