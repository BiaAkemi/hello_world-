package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World";
	}

@RestController
@RequestMapping("/bsm-gen")
public class BSMGen {
		
	@GetMapping
	public String bsm () {
		return "<strong>BSM's da Generation Brazil:</strong>"
				+ "<br/>Persistência;<br/>"
				+ "Mentalidade de Crescimento;<br/>"
				+ "Responsabilidade Pessoal;<br/>"
				+ "Orientação ao Futuro;<br/>"
				+ "Proatividade;<br/>"
				+ "Comunicação;<br/>"
				+ "Trabalho em Equipe;<br/>"
				+ "Orientação ao Detalhe.";
		}
	}

@RestController
@RequestMapping("/objetivos")
public class Objetivos {
		
	@GetMapping
	public String objetivos () {
		return "<strong>Gostaria de aprender:</strong>"
				+ "<br>Aplicar o que aprendi até agora sobre banco de dados + Spring + Java;<br/>"
				+ "<br>Aprender HTML;<br/>";
		}
	}
}
