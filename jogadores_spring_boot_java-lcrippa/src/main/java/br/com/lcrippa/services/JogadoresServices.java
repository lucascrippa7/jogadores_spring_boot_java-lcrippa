package br.com.lcrippa.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.lcrippa.model.Jogadores;

@Service
public class JogadoresServices {

	private final AtomicLong counter = new AtomicLong();

	public Jogadores findById(String id) {
		Jogadores jogador = new Jogadores();
		jogador.setId(counter.incrementAndGet());
		jogador.setNome("Leandro");
		jogador.setSobrenome("Costa");
		jogador.setPosicao("Atacante");
		jogador.setCPF("4578954");
		jogador.setDt_nascimento("01/01/1991");
		return jogador;
	}

	public List<Jogadores> findAll() {
		List<Jogadores> jogadores = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			Jogadores jogador1 = mockJogadores(i);
			jogadores.add(jogador1);

		}
		return jogadores;
	}

	private Jogadores mockJogadores(int i) {
		Jogadores jogador = new Jogadores();
		jogador.setId(counter.incrementAndGet());
		jogador.setNome("Person name" + i);
		jogador.setSobrenome("Last Name " + i);
		jogador.setCPF("123456 " + i);
		jogador.setDt_nascimento("01/31/2" + i);
		jogador.setPosicao("Atacante");
		return jogador;
	}

	public Jogadores create(Jogadores jogador) {
		return jogador;
	}

	public Jogadores update(Jogadores jogador) {
		return jogador;
	}
	
	
	public void delete(String id) {
		
	}
}
