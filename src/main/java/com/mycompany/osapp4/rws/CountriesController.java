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

import com.mycompany.osapp4.dto.CountriesDTO;
import com.mycompany.osapp4.entity.Countries;
import com.mycompany.osapp4.service.CountriesService;

@RestController
public class CountriesController 
{
	private static final Logger logger = LoggerFactory.getLogger(CountriesController.class);
	
	@Autowired
	CountriesService service;

	@RequestMapping(value = "/countries/count", method = RequestMethod.GET)
	public ResponseEntity<Long> count()
	{		
		return new ResponseEntity<Long>(service.count(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/countries", method = RequestMethod.GET)
	public ResponseEntity<List<Countries>> findAll()
	{		
		return new ResponseEntity<List<Countries>>(service.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/countries/{page}/{size}", method = RequestMethod.GET)
	public ResponseEntity<Page<Countries>> findAll(@PathVariable Integer page, @PathVariable Integer size)
	{		
		return new ResponseEntity<Page<Countries>>(service.findAll(page - 1, size), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/country", method = RequestMethod.POST)
	public ResponseEntity<Countries> save(@RequestBody CountriesDTO countryDTO)
	{
		logger.info("Creating entity");
		return new ResponseEntity<Countries>(service.save(countryDTO), HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/country/{id}", method = RequestMethod.GET)
	public ResponseEntity<Countries> findOne(@PathVariable String id)
	{		
		return new ResponseEntity<Countries>(service.findOne(id), HttpStatus.OK);
	}

	@RequestMapping(value = "/country/{id}", method = RequestMethod.PATCH)
	public ResponseEntity<Countries> partialUpdate(@RequestBody CountriesDTO countryDTO, @PathVariable("id") String id) 
	{    
		logger.info("Updating entity");
		return new ResponseEntity<Countries>(service.update(countryDTO), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/country/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> delete(@PathVariable String id)
	{				
		logger.info("Deleting entity");
		String res = service.delete(id);		
		if(res!=null && res.equals("OK"))
		{
			return new ResponseEntity<String>(res, HttpStatus.NO_CONTENT);
		}
		else
		{
			return new ResponseEntity<String>(res, HttpStatus.NOT_FOUND);
		}	
	}
}
