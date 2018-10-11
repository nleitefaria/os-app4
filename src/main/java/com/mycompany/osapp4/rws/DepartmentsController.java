package com.mycompany.osapp4.rws;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.osapp4.dto.DepartmentsDTO;
import com.mycompany.osapp4.entity.Departments;
import com.mycompany.osapp4.service.DepartmentsService;

@RestController
public class DepartmentsController
{
	private static final Logger logger = LoggerFactory.getLogger(DepartmentsController.class); 
	
	@Autowired
	DepartmentsService service;

	@RequestMapping(value = "/departments/count", method = RequestMethod.GET)
	public ResponseEntity<Long> count()
	{		
		return new ResponseEntity<Long>(service.count(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/departments", method = RequestMethod.GET)
	public ResponseEntity<List<Departments>> findAll()
	{		
		return new ResponseEntity<List<Departments>>(service.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/department/{id}", method = RequestMethod.GET)
	public ResponseEntity<Departments> findOne(@PathVariable String id)
	{		
		return new ResponseEntity<Departments>(service.findOne(id), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/department", method = RequestMethod.POST)
	public ResponseEntity<Departments> save(@RequestBody DepartmentsDTO departmentDTO)
	{
		return new ResponseEntity<Departments>(service.save(departmentDTO), HttpStatus.CREATED);
	}
	
	

}
