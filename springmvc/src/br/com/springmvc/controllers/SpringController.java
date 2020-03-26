package br.com.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {

	@RequestMapping("/teste")
	public String execute(){
		System.out.println("Executando lógica em Spring MVC");
		return "ok";
		
	}
}
