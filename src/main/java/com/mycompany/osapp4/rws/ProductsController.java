package com.mycompany.osapp4.rws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
	
	@GetMapping(value = "/products")
    public String findAll() {
        return "hello";
    }

}
