package com.mycompany.osapp4.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.mycompany.osapp4.dto.EmployeesDTO;
import com.mycompany.osapp4.entity.Employees;

public interface EmployeesService 
{
	Long count();
	Employees findOne(String id);
	List<Employees> findAll();
	Page<Employees> findAll(int page, int size);
	Employees save(EmployeesDTO employeesDTO);
	Employees update(EmployeesDTO employeesDTO);
}
