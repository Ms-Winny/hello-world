package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BSMs")
public class BSMsController {	
	
	@GetMapping
	public String bsms() {
		return "HABILIDADES: \nTrabalho em equipe \nOrientação ao detalhe \nProatividade \nComunicação \n\nMENTALIDADES: \nOrientação ao futuro \n" +
	"Responsabilidade pessoal \nMentalidade de crescimento \nPersistência";
	}

}
