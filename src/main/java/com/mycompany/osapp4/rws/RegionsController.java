package com.mycompany.osapp4.rws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.osapp4.service.impl.RegionsServiceImpl;

@RestController
public class RegionsController 
{
	@Autowired
	RegionsServiceImpl regionsService;
	
	@GetMapping(value = "/regions/count")
    public String findAll() {
        return "findAll products";
    }
	
	@GetMapping("/regions/count")
	public ResponseEntity<Long> cout()
	{
		return new ResponseEntity<Long>(regionsService.count(), HttpStatus.OK);
	}


}
