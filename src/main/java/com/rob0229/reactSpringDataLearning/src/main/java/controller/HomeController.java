package com.rob0229.reactSpringDataLearning.src.main.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/")
	public String home(Model model) {
		 model.addAttribute("pageTitle","Welcome to my Awesome Dynamic Application");
		return "index";
	}
	
}
