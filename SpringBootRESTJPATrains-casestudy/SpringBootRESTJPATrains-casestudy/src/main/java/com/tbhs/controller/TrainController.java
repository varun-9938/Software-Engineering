package com.tbhs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tbhs.model.Trains;
import com.tbhs.repository.TrainRepository;

@RestController
@RequestMapping("/trains")
public class TrainController 
{	
	@Autowired
	TrainRepository repository;
	
	//To embed webpages
	@RequestMapping("Login.html")
	@PostMapping("/train")
	
	//To insert a new record into a table
	public ResponseEntity<Trains> save(@RequestBody Trains train)
	{
	  return new ResponseEntity<Trains>(repository.save(train),HttpStatus.OK);	
	}
	
	//To get all train details from db
	@GetMapping("/AllTrains")
	public ResponseEntity<List<Trains>> getAllTrains()
	{		
	  return new ResponseEntity<List<Trains>>(repository.findAll(),HttpStatus.OK);
	}
	
	//To get a particular train detail using id
	@GetMapping("/getTrain/{trainid}")
	public ResponseEntity<Trains> getATrain(@PathVariable("trainid")  int trainid)
	{		
		//optional class avoids null pointer exception
		Optional<Trains> tr= repository.findById(trainid);
		if(tr.isPresent()) 
		{
		  return new ResponseEntity<Trains>(tr.get(),HttpStatus.OK);
		}
		
		return new ResponseEntity<Trains>(HttpStatus.NOT_FOUND);		
	}	
	
	//delete a record
	@DeleteMapping("/deleteTrain/{trainid}")
	public ResponseEntity<Trains> deleteATrain(@PathVariable("trainid")  int trainid)
	{
		if(repository.existsById(trainid)) 
		{
			repository.deleteById(trainid);
			return new ResponseEntity<Trains>(HttpStatus.NO_CONTENT);
		}
		else
			return new ResponseEntity<Trains>(HttpStatus.NOT_FOUND);
		
	}	
}
