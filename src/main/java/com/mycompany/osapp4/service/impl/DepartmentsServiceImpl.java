package com.mycompany.osapp4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.osapp4.entity.Departments;
import com.mycompany.osapp4.repository.DepartmentsRepository;
import com.mycompany.osapp4.service.DepartmentsService;

@Service
public class DepartmentsServiceImpl implements DepartmentsService 
{
	@Autowired
	private DepartmentsRepository repository;

	@Transactional
	public Long count() 
	{
		return repository.count();
	}

	@Transactional
	public List<Departments> findAll() 
	{
		return repository.findAll();
	}
	
	@Transactional
	public Departments findOne(String id)
	{
		return repository.findOne(Integer.parseInt(id));
	}
	
	@Transactional
	public Departments save(Departments departments) 
	{
		return repository.save(departments);
	}
	
	

}
