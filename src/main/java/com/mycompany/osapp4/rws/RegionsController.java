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

import com.mycompany.osapp4.dto.RegionsDTO;
import com.mycompany.osapp4.entity.Regions;
import com.mycompany.osapp4.service.RegionsService;

@RestController
public class RegionsController 
{
	private static final Logger logger = LoggerFactory.getLogger(RegionsController.class); 
	
	@Autowired
	RegionsService service;

	@RequestMapping(value = "/regions/count", method = RequestMethod.GET)
	public ResponseEntity<Long> count()
	{		
		return new ResponseEntity<Long>(service.count(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/regions", method = RequestMethod.GET)
	public ResponseEntity<List<Regions>> findAll()
	{		
		return new ResponseEntity<List<Regions>>(service.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/region/{id}", method = RequestMethod.GET)
	public ResponseEntity<Regions> findOne(@PathVariable String id)
	{		
		return new ResponseEntity<Regions>(service.findOne(id), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/region", method = RequestMethod.POST)
	public ResponseEntity<Regions> save(@RequestBody RegionsDTO regionsDTO)
	{
		return new ResponseEntity<Regions>(service.save(regionsDTO), HttpStatus.CREATED);
	}	
}
