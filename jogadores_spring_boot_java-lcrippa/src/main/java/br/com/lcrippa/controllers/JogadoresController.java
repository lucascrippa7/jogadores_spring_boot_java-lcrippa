package br.com.lcrippa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lcrippa.model.Jogadores;
import br.com.lcrippa.services.JogadoresServices;

@RestController
@RequestMapping("/jogadores")

public class JogadoresController {
	
	@Autowired
	private JogadoresServices service;

	@GetMapping( produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Jogadores>findAll(){
		return service.findAll();
	}
	
	@GetMapping(value = "/{id}",  produces = MediaType.APPLICATION_JSON_VALUE)
	public Jogadores findById(@PathVariable(value = "id") Long id) {
		return service.findById(id);
	}
	
	@PostMapping( consumes = MediaType.APPLICATION_JSON_VALUE, produces =MediaType.APPLICATION_JSON_VALUE)
	public Jogadores create(@RequestBody Jogadores jogador) {
		return service.create(jogador);
	}
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Jogadores update(@RequestBody Jogadores jogador) {
		return service.update(jogador);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();	
		}
}
