package com.service.rest.webapp;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@Autowired
	private HelloRepository service;

	
	@GetMapping("/helloMap")
	public ModelAndView getHello(){
		 return new ModelAndView("helloHelp", "hello", new Hello());
	}
	
	@PostMapping("/helloMap")
	public String getHelloSend(@Valid @ModelAttribute("hello") Hello hello, ModelMap model, BindingResult result ){
		//for persistence
		model.addAttribute("hello", hello);
		//service execution
		service.save(hello);
		//place object on UI
		return "helloView";
	}
}
