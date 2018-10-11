package com.mycompany.osapp4.service;

import java.util.List;

import com.mycompany.osapp4.entity.Departments;

public interface DepartmentsService 
{	
	Long count();
	List<Departments> findAll();
	Departments findOne(String id);
}
