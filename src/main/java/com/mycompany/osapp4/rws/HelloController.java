package com.mycompany.osapp4.rws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	@GetMapping(value = "/hello")
    public String sayHello() {
        return "hello";
    }

}
