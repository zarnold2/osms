package com.example.osms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OsmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OsmsApplication.class, args);
	}
	
  @GetMapping(value="/")
  public String greeting()
  {
    return "Hello World from OpenShift";
  }
  
  @GetMapping(value="/{name}")
  public String greeting2(@PathVariable("name") String name)
  {
    return "Hello " + name + " from OpenShift";
  }


}
