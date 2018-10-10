package com.mycompany.osapp4.rws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.osapp4.service.impl.RegionsServiceImpl;

@RestController
public class RegionsController 
{
	@Autowired
	RegionsServiceImpl regionsService;

	@RequestMapping(value = "/regions/count", method = RequestMethod.GET)
	public ResponseEntity<Long> count()
	{		
		return new ResponseEntity<Long>(regionsService.count(), HttpStatus.OK);
	}


}
