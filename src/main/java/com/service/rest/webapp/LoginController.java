package com.service.rest.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

//Get Method is not secure


//CANNOT BE A RESTCONTROLLER TO CONNECT TO A JSP. Must be Controller
@Controller
@SessionAttributes(value={"name","password"})
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@GetMapping("/login")
	public String loginShow(ModelMap model){
		//Whatever in here is available to the JSP
		//model.put("name", name);
		return "login";
	}
	
	@PostMapping("/login")
	public String loginMessage(@RequestParam String name,@RequestParam String password, ModelMap model){
		//Whatever in here is available to the JSP
		model.put("name", name);
		model.put("password", password);
		if (service.validate(name, password)){
			return "welcome";
		}
		else {
			model.put("message", "Invalid Credentials");
			return "login";
		}
		
	}
}

//Values in Model and Request by default are Request scope ONLY
//Session is needed
// On all controllers put @SessionAttributes