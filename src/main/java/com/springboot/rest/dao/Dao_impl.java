package com.springboot.rest.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.rest.model.Customer;

import antlr.collections.List;
@Repository
public class Dao_impl implements Dao_interface {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public long save(Customer cust) {
		sessionFactory.openSession().save(cust);
		return cust.getId();
	}

	

}
