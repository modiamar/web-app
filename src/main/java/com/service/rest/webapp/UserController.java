package com.service.rest.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
	//To pass data from Controller to View, you have to use a Model
	
	
	@RequestMapping("/user")
	public String getUser( String name, ModelMap model){
		model.put("name", name);
		return "user";
	}
}
