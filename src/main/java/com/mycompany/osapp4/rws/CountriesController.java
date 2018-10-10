package com.mycompany.osapp4.rws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.osapp4.entity.Countries;
import com.mycompany.osapp4.entity.Locations;
import com.mycompany.osapp4.service.CountriesService;
import com.mycompany.osapp4.service.LocationsService;

@RestController
public class CountriesController 
{
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

}
