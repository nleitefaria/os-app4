package com.mycompany.osapp4.rws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.osapp4.entity.Departments;
import com.mycompany.osapp4.service.DepartmentsService;

@RestController
public class DepartmentsController
{
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

}
