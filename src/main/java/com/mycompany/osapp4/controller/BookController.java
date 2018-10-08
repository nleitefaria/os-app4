package com.mycompany.osapp4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController 
{
	@GetMapping(value = "/hello")
    public String sayHello() {
        System.out.println("@sayHello");
        return "hello";
    }

}
