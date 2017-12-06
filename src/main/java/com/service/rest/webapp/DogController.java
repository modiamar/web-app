package com.service.rest.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DogController {
	
	@Autowired
	private DogRepository dogRepository;
	
	///// Convert Dog from form to POJO
	
	@GetMapping("/addDog")
	public ModelAndView getDog(){
		 return new ModelAndView("DogList", "dog", new Dog());
	}
	
	@PostMapping("/addDog")
	public String addDog(@ModelAttribute("dog") Dog dog, ModelMap model, BindingResult result){
		dogRepository.save(dog);
		return dog.toString();
	}

}
