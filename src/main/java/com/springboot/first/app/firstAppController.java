package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController    //this anotation is combination of both Controller and ResponseBody annotation 


//@Controller
//@ResponseBody     this anotation uses http message converters to convert the return value to http response body
public class firstAppController {

	//Get Http method
	//http://localhost:8080/first-app
	
	@GetMapping ("/first-app")  //this annotation makes the below class as Rest Api
	public String firstApp() {
		return "Spring First App";
	}
	
	
	
	
	
	
	
	
//	Rest API should return in different representational format like json or xml format  
//	so use @ResponseBody annotation is used to return this kind of response and it convert java object into json or xml send back to the client
//	
//	get
//	post
//	put
//	delete
	
	
	
}
