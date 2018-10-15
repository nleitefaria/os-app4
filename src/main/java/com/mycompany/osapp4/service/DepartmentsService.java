package com.mycompany.osapp4.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.mycompany.osapp4.dto.DepartmentsDTO;
import com.mycompany.osapp4.entity.Departments;

public interface DepartmentsService 
{	
	Long count();
	List<Departments> findAll();
	Page<Departments> findAll(int page, int size);
	Departments findOne(String id);
	Departments save(DepartmentsDTO departmentsDTO);
	Departments update(DepartmentsDTO departmentsDTO);
}
