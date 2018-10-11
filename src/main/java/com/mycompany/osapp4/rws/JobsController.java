package com.mycompany.osapp4.rws;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.osapp4.entity.Jobs;
import com.mycompany.osapp4.service.JobsService;

@RestController
public class JobsController 
{
	private static final Logger logger = LoggerFactory.getLogger(JobsController.class); 
	
	@Autowired
	JobsService service;

	@RequestMapping(value = "/jobs/count", method = RequestMethod.GET)
	public ResponseEntity<Long> count()
	{		
		return new ResponseEntity<Long>(service.count(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/jobs", method = RequestMethod.GET)
	public ResponseEntity<List<Jobs>> findAll()
	{		
		return new ResponseEntity<List<Jobs>>(service.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/job/{id}", method = RequestMethod.GET)
	public ResponseEntity<Jobs> findOne(@PathVariable String id)
	{		
		return new ResponseEntity<Jobs>(service.findOne(id), HttpStatus.OK);
	}
	
}
