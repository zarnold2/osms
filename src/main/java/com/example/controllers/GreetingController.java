package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.services.GreetingService;

@RestController
public class GreetingController {
  
  @Autowired
  GreetingService greetingService;
	
  @GetMapping(value="/")
  public String greeting()
  {
    return greetingService.helloWorld();
  }
  
  @GetMapping(value="/{name}")
  public String greeting2(@PathVariable("name") String name)
  {
    return "Hello " + name + " from OpenShift";
  }

}
