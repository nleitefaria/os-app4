package com.mycompany.osapp4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.osapp4.entity.Employees;
import com.mycompany.osapp4.repository.EmployeesRepository;
import com.mycompany.osapp4.service.EmployeesService;

@Service
public class EmployeesServiceImpl implements EmployeesService
{
	@Autowired
	private EmployeesRepository repository;

	@Transactional
	public Long count() 
	{
		return repository.count();	
	}

	@Transactional
	public List<Employees> findAll() 
	{
		return repository.findAll();		
	}

}
