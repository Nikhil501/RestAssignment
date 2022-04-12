package com.springboot.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.rest.dao.Dao_interface;
import com.springboot.rest.model.Customer;

import antlr.collections.List;
@Service
public class Service_impl implements Service_interface{
	
	@Autowired
	Dao_interface di;


	@Override
	public long save(Customer cust) {
		return di.save(cust);
	}


}
