package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Step 1: Create controller Class, controller is a child of component

@Controller
public class HomeController {
 
	//step 2: define controller method
	//step 3: Add @RequestMapping to controller method
	
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
}
