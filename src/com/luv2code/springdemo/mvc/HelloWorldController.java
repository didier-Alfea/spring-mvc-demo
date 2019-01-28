package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	// need a controller method to show the initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "hello-world";
	}
	
	// Add a new controller method to read form data and add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// read the request param from the HTML form
		String theName = request.getParameter("studentName");
		
		// Convert to uppercase
		theName = theName.toUpperCase();
		
		// Create the message
		String result = "Yo! " + theName;
		
		// add  message to the model
		model.addAttribute("message", result);
		
		return "hello-world";
	}

	//
	@RequestMapping("/processFormVersionThree")
//	use annotation passing parameter
	public String processFormVersionThree(
		@RequestParam("studentName") String theName
		, Model model) {
		
		// Convert to uppercase
				theName = theName.toUpperCase();
		
		// Create the message
		String result = "Hello My friends from V3! " + theName;
		
		// add  message to the model
		model.addAttribute("message", result);
		
		return "hello-world";
	}
}
