package br.edu.ifes.serra.model.dao;

import org.springframework.data.repository.Repository;

import br.edu.ifes.serra.model.Cardapio;

public interface CardapioDAO extends Repository<Cardapio, Long> {

	public Cardapio findById(Long cardCod);
}
