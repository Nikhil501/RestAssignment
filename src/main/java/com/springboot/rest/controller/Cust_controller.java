package com.springboot.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.model.Customer;
import com.springboot.rest.service.Service_interface;

@RestController
public class Cust_controller {
	
	@Autowired
	Service_interface si;
	@PostMapping("/cust")
	public ResponseEntity<?> save(@RequestBody Customer cust)
	{
		long id = si.save(cust);
		return ResponseEntity.ok("Employee record saved successfully with : "+id);
	}
	

}
