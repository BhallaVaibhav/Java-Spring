package com.programcreek.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController { //implements Abstract Controller
	 
	@RequestMapping("/hello")
	public ModelAndView showMessage(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("HelloWorld");
		mv.addObject("welcomeMessage", "Welcome to Spring MVC!");
		mv.addObject("name", name);
		return mv;
	}
	
}
