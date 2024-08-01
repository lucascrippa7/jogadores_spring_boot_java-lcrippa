package br.com.lcrippa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lcrippa.exception.ResourceNotFoundException;
import br.com.lcrippa.model.Jogadores;
import br.com.lcrippa.repositories.JogadoresRepository;

@Service
public class JogadoresServices {

	@Autowired
	JogadoresRepository repository;

	public Jogadores findById(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
	}

	public List<Jogadores> findAll() {

		return repository.findAll();
	}

	public Jogadores create(Jogadores jogador) {
		return repository.save(jogador);
	}

	public Jogadores update(Jogadores jogador) {

		var entity = repository.findById(jogador.getId())
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));

		entity.setNome(jogador.getNome());
		entity.setSobrenome(jogador.getSobrenome());
		entity.setCPF(jogador.getCPF());
		entity.setDt_nascimento(jogador.getDt_nascimento());
		entity.setPosicao(jogador.getPosicao());
		return repository.save(jogador);
	}

	

	public void delete(Long id) {
		
		var entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
		
		repository.delete(entity);

	}
}
