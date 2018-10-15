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

import com.mycompany.osapp4.dto.JobsDTO;
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
	
	@RequestMapping(value = "/job/{id}", method = RequestMethod.GET)
	public ResponseEntity<Jobs> findOne(@PathVariable String id)
	{		
		return new ResponseEntity<Jobs>(service.findOne(id), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/jobs", method = RequestMethod.GET)
	public ResponseEntity<List<Jobs>> findAll()
	{		
		return new ResponseEntity<List<Jobs>>(service.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/jobs/{page}/{size}", method = RequestMethod.GET)
	public ResponseEntity<Page<Jobs>> findAll(@PathVariable Integer page, @PathVariable Integer size)
	{		
		return new ResponseEntity<Page<Jobs>>(service.findAll(page - 1, size), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/job", method = RequestMethod.POST)
	public ResponseEntity<Jobs> save(@RequestBody JobsDTO jobsDTO)
	{
		return new ResponseEntity<Jobs>(service.save(jobsDTO), HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/job/{id}", method = RequestMethod.PATCH)
	public ResponseEntity<Jobs> partialUpdate(@RequestBody JobsDTO jobsDTO, @PathVariable("id") String id) 
	{    
		logger.info("Updating entity");
		return new ResponseEntity<Jobs>(service.update(jobsDTO), HttpStatus.OK);
	}	
}
