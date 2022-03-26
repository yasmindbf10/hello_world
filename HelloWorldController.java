package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello-World")
public class HelloWorldController {

	@GetMapping
	public String saudacao(){
	return "Hello world!";
	}
	@GetMapping("/BSM")
	public String BSM(){
	return " Mentalidade de Crescimento\r\n"
			+ "Persistência\r\n"
			+ "Responsabilidade Pessoal\r\n"
			+ "Orientação ao Futuro\r\n"
			+ "Comunicação\r\n"
			+ "Orientação ao Detalhe\r\n"
			+ "Proatividade\r\n"
			+ "Trabalho em Equipe";
	}
	@GetMapping("/objetivos")
	public String Objetivos(){
	return "Deixar a câmera aberta =P";
	}
}
