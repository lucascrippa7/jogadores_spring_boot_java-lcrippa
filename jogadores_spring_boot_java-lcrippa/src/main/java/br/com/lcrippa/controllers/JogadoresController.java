package br.com.lcrippa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.lcrippa.model.Jogadores;
import br.com.lcrippa.services.JogadoresServices;

@RestController
@RequestMapping("/jogadores")

public class JogadoresController {
	
	@Autowired
	private JogadoresServices service;

	@RequestMapping(method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Jogadores>findAll(){
		return service.findAll();
	}
}
