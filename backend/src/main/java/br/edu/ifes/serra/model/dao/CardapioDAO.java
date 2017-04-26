package br.edu.ifes.serra.model.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import br.edu.ifes.serra.model.Cardapio;

public interface CardapioDAO extends Repository<Cardapio, Long> {

	public Cardapio findByCardCod(Long cardCod);

	public List<Cardapio> findAll();

	public Cardapio save(Cardapio cardapio);

}
