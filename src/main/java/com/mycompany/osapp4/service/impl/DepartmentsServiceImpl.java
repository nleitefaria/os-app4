package com.mycompany.osapp4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.osapp4.dto.DepartmentsDTO;
import com.mycompany.osapp4.entity.Departments;
import com.mycompany.osapp4.repository.DepartmentsRepository;
import com.mycompany.osapp4.service.DepartmentsService;

@Service
public class DepartmentsServiceImpl implements DepartmentsService 
{
	@Autowired
	private DepartmentsRepository repository;

	public Long count() 
	{
		return repository.count();
	}

	public List<Departments> findAll() 
	{
		return repository.findAll();
	}
	
	public Departments findOne(String id)
	{
		return repository.findOne(Integer.parseInt(id));
	}
	
	public Page<Departments> findAll(int page, int size) 
	{
		return repository.findAll(new PageRequest(page, size));
	}
	
	@Transactional
	public Departments save(DepartmentsDTO departmentsDTO) 
	{
		Departments departments = new Departments(departmentsDTO.getDepartmentId(), departmentsDTO.getDepartmentName());
		return repository.save(departments);
	}
	
	@Transactional
	public Departments update(DepartmentsDTO departmentsDTO) 
	{
		Departments departments = repository.getOne(departmentsDTO.getDepartmentId());
		departments.setDepartmentName(departmentsDTO.getDepartmentName());
		return repository.save(departments);
	}
	
	@Transactional
	public String delete(Integer id) 
	{
		Departments department = repository.getOne(id);
		try
		{
			repository.delete(department);
			return "OK";
		}
		catch (Exception e)
		{
			return "KO";
		}		
	}

}
