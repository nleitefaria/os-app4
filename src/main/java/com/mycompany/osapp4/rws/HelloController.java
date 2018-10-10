package com.mycompany.osapp4.rws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ResponseEntity<String> findAll() {
		logger.info("Hello");
		return new ResponseEntity<String>("Hello", HttpStatus.OK);
	}

}
