package br.com.lcrippa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lcrippa.model.Jogadores;

public interface JogadoresRepository extends JpaRepository<Jogadores, Long> {}
