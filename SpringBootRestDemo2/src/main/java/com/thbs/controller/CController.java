package com.thbs.controller;
 
import java.util.List;
 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.thbs.model.Customer;
import com.thbs.model.CRepository;
 
@RestController
@RequestMapping("/Customers")
public class CController {

   @GetMapping("/getAllCustomers")    
   public ResponseEntity<List<Customer>>getAllCustomersDetails()
   {
       CRepository br = new CRepository();
       List<Customer>clist=br.getAllCustomers();
       return new ResponseEntity<List<Customer>>(clist,HttpStatus.OK);
   }
 
}