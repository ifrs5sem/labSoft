package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@GetMapping("/greeting")
	public String greeting(
			@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);//modelo
		return "greeting"; //arquivo na paste resources/templates
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	@ResponseBody //retorna uma String e não uma referência a um template
	public String home() {
		return "string retornada no corpo da requisição";
	}
}