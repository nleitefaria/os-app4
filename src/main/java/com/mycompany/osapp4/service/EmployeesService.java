package com.mycompany.osapp4.service;

import java.util.List;

import com.mycompany.osapp4.entity.Employees;

public interface EmployeesService 
{
	Long count();
	List<Employees> findAll();

}