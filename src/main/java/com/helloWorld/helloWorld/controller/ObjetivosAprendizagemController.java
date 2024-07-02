package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosAprendizagemController {
	
	@GetMapping
	public String objetivos() {
		return "Objetivos de Aprendizagem desta Semana: \n\n- Orientação ao futuro. Preciso focar em estudar mais tecnologias que me ajudem a enconntrar meu emprego."+
				"\n- Responsabilidade pessoal. Preciso ter mais responsabilidade com os horários e com a entrega de tarefas."+
				"\n- Persistência. Preciso focar e me esforçar mais, organizando meu tempo para me dedicar mais ao curso, porque sei que sou capaz.";
	}
}
