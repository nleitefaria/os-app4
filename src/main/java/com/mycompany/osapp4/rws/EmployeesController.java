package com.mycompany.osapp4.rws;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.osapp4.dto.EmployeesDTO;
import com.mycompany.osapp4.entity.Employees;
import com.mycompany.osapp4.service.EmployeesService;

@RestController
public class EmployeesController
{
	private static final Logger logger = LoggerFactory.getLogger(EmployeesController.class); 
	
	@Autowired
	EmployeesService service;

	@RequestMapping(value = "/employees/count", method = RequestMethod.GET)
	public ResponseEntity<Long> count()
	{		
		return new ResponseEntity<Long>(service.count(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public ResponseEntity<List<Employees>> findAll()
	{		
		return new ResponseEntity<List<Employees>>(service.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/employees/{page}/{size}", method = RequestMethod.GET)
	public ResponseEntity<Page<Employees>> findAll(@PathVariable Integer page, @PathVariable Integer size)
	{		
		return new ResponseEntity<Page<Employees>>(service.findAll(page - 1, size), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public ResponseEntity<Employees> findOne(@PathVariable String id)
	{		
		return new ResponseEntity<Employees>(service.findOne(id), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public ResponseEntity<Employees> save(@RequestBody EmployeesDTO employeeDTO)
	{
		return new ResponseEntity<Employees>(service.save(employeeDTO), HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.PATCH)
	public ResponseEntity<Employees> partialUpdateName(@RequestBody EmployeesDTO employeesDTO, @PathVariable("id") String id) 
	{    
		logger.info("Updating entity");
		return new ResponseEntity<Employees>(service.update(employeesDTO), HttpStatus.OK);
	}
	

}
