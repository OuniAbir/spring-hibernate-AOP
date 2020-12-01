package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	//need a controller meth to show the initial HTML Form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need a controller meth to process the HTML Form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	
	//need a controller meth to process the HTML Form
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {

		//read request paramter from the HTML form 
		String theName = request.getParameter("studentName");
		theName = theName.toUpperCase();
		//create the message
		String result = "YO !"+ theName;
		//add data to the model 
		model.addAttribute("message", result);	
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName") String theName, Model model) {

		//read request paramter from the HTML form 
		theName = theName.toUpperCase();
		//create the message
		String result = "processFormVersionThree  !"+ theName;
		//add data to the model 
		model.addAttribute("message", result);	
		return "helloworld";
	}
	
	
	
}
