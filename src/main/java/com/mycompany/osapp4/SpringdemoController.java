package com.mycompany.osapp4;

iimport org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class SpringdemoController {
  
  @GetMapping(value = "/hello")
  public String index() {
    return "Hello!";
  }
}
