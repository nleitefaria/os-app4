package com.mycompany.osapp4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.osapp4.dto.EmployeesDTO;
import com.mycompany.osapp4.entity.Employees;
import com.mycompany.osapp4.entity.Jobs;
import com.mycompany.osapp4.repository.EmployeesRepository;
import com.mycompany.osapp4.repository.JobsRepository;
import com.mycompany.osapp4.service.EmployeesService;

@Service
public class EmployeesServiceImpl implements EmployeesService
{
	@Autowired
	private EmployeesRepository repository1;
	
	@Autowired
	private JobsRepository repository2;

	
	public Long count() 
	{
		return repository1.count();	
	}

	public List<Employees> findAll() 
	{
		return repository1.findAll();		
	}
	
	public Employees findOne(String id)
	{
		return repository1.findOne(Integer.parseInt(id));
	}
	
	public Page<Employees> findAll(int page, int size) 
	{
		return repository1.findAll(new PageRequest(page, size));
	}
	
	@Transactional
	public Employees save(EmployeesDTO employeesDTO) 
	{
		Jobs jobs = repository2.findOne(employeesDTO.getJobId());
		Employees employees = new Employees(employeesDTO.getEmployeeId(), jobs, employeesDTO.getLastName(), employeesDTO.getEmail(), employeesDTO.getHireDate(), employeesDTO.getSalary());		
		return repository1.save(employees);
	}
	
	@Transactional
	public Employees update(EmployeesDTO employeesDTO) 
	{
		Employees employees = repository1.getOne(employeesDTO.getEmployeeId());
		employees.setFirstName(employeesDTO.getFirstName());
		employees.setLastName(employeesDTO.getLastName());
		employees.setEmail(employeesDTO.getEmail());
		employees.setHireDate(employeesDTO.getHireDate());
		return repository1.save(employees);	
	}
	
	@Transactional
	public String delete(Integer id) 
	{
		Employees employees = repository1.getOne(id);
		try
		{
			repository1.delete(employees);
			return "OK";
		}
		catch (Exception e)
		{
			return "KO";
		}		
	}
}
