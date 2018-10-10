package com.mycompany.osapp4.rws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.osapp4.entity.Locations;
import com.mycompany.osapp4.entity.Regions;
import com.mycompany.osapp4.service.LocationsService;
import com.mycompany.osapp4.service.impl.LocationsServiceImpl;
import com.mycompany.osapp4.service.impl.RegionsServiceImpl;

@RestController
public class LocationsController
{
	@Autowired
	LocationsService service;

	@RequestMapping(value = "/locations/count", method = RequestMethod.GET)
	public ResponseEntity<Long> count()
	{		
		return new ResponseEntity<Long>(service.count(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/locations", method = RequestMethod.GET)
	public ResponseEntity<List<Locations>> findAll()
	{		
		return new ResponseEntity<List<Locations>>(service.findAll(), HttpStatus.OK);
	}

}
