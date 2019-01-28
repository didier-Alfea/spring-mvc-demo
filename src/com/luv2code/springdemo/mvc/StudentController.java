package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		//Create a student object
		Student theStudent = new Student();
		
		// add student obj to the mmodel
		theModel.addAttribute("student",  theStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		// Affiche les data recues
		System.out.println("The Student : " + theStudent.getFirstName() 
						+ " " + theStudent.getLastName());
		return "student-confirmation";
	}
}
