package com.service.rest.webapp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes(value ={"name","password"})
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@Autowired
	private TodoRepository todoRepo;
	
	@GetMapping(value="/list-todos")
	public String getTodos(ModelMap model){
		String name = (String) model.get("name");
		//model.get("password");
		List<Todo> retrieveTodos = todoService.retrieveTodos(name);
		model.put("todos", retrieveTodos);
		return "list-todos";
	}
	
	@GetMapping("/add-todos")
	public String addTodoPage(ModelMap model){
		return "add-todos";
	}
	
	@PostMapping("/add-todos")
	public String addTodo(@RequestParam String desc ,ModelMap model){
		/**
		todoService.addTodo(todo.getUser(), todo.getDesc(), new Date(),
                false);
                **/
		todoService.addTodo((String)model.get("name"), desc, new Date(),
                false);
		//You need to retrieve the todos to display them
		//model.put("todos", todoService.retrieveTodos((String)model.get("name")));
		return "redirect:/list-todos";
		
		
		
	}
	
}
