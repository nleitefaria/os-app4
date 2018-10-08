package com.mycompany.osapp4;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SpringdemoController {
  @RequestMapping("/hello")
  public String index() {
    return "Hello!";
  }
}
