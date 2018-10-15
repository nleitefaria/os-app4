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

import com.mycompany.osapp4.dto.LocationsDTO;
import com.mycompany.osapp4.entity.Locations;
import com.mycompany.osapp4.service.LocationsService;

@RestController
public class LocationsController
{
	private static final Logger logger = LoggerFactory.getLogger(LocationsController.class); 
	
	@Autowired
	LocationsService service;

	@RequestMapping(value = "/locations/count", method = RequestMethod.GET)
	public ResponseEntity<Long> count()
	{		
		return new ResponseEntity<Long>(service.count(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/location/{id}", method = RequestMethod.GET)
	public ResponseEntity<Locations> findOne(@PathVariable String id)
	{		
		return new ResponseEntity<Locations>(service.findOne(id), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/locations", method = RequestMethod.GET)
	public ResponseEntity<List<Locations>> findAll()
	{		
		return new ResponseEntity<List<Locations>>(service.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/locations/{page}/{size}", method = RequestMethod.GET)
	public ResponseEntity<Page<Locations>> findAll(@PathVariable Integer page, @PathVariable Integer size)
	{		
		return new ResponseEntity<Page<Locations>>(service.findAll(page - 1, size), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/location", method = RequestMethod.POST)
	public ResponseEntity<Locations> save(@RequestBody LocationsDTO locationsDTO)
	{
		return new ResponseEntity<Locations>(service.save(locationsDTO), HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/location/{id}", method = RequestMethod.PATCH)
	public ResponseEntity<Locations> partialUpdate(@RequestBody LocationsDTO locationsDTO, @PathVariable("id") String id) 
	{    
		logger.info("Updating entity");
		return new ResponseEntity<Locations>(service.update(locationsDTO), HttpStatus.OK);
	}
	
}
