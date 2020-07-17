package com.example.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService
{
  
  public String helloWorld() {
    return "Hello World from OpenShift";
  }

}
