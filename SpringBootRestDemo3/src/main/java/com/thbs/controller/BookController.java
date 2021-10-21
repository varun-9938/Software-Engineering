package com.thbs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thbs.model.Book;
import com.thbs.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
	BookRepository bp;
	@PostMapping("/book") 
	public ResponseEntity<Book> save(@RequestBody Book b){
		Book bk = bp.save(b);
		return new ResponseEntity<Book>(bk,HttpStatus.OK);
		
}
	@GetMapping("/getAllBooks")
	public ResponseEntity<List<Book>> getAllBooks(){
		List<Book> blist = bp.findAll();
		
		return new ResponseEntity<List<Book>>(blist,HttpStatus.OK);
		
		
	}
	@GetMapping("/getABook/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable int id){
		Optional<Book> bk = bp.findById(id);
		if(bk.isPresent()) {
			Book b = bk.get();
			return new ResponseEntity<Book>(b,HttpStatus.OK);
		}
		return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
	}
	@DeleteMapping("/deleteABook/{id}")
	public ResponseEntity<Book> deleteBookById(@PathVariable int id){
		if(bp.existsById(id)) {
			bp.deleteById(id);
			return new ResponseEntity<Book>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
	}
}
