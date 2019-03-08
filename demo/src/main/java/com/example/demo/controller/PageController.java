package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {
	@Value("${pageController.mensagem}")
	private String mensagem;
	@Value("${pageController.nova-mensagem}")
	private String novaMensagem;
	@Value("${spring.mensagem}")
	private String msg;
	
	@GetMapping("/")
	public String mensagemInicial() {
		return msg;
	}
	
	@GetMapping("/mensagem")
	public String mensagem() {
		return mensagem;
	}
	
	@GetMapping("/novaMensagem")
	public String novaMensagem() {
		return novaMensagem;
	}
	
	
}