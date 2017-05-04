package br.edu.ifes.serra.model.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import br.edu.ifes.serra.model.entity.Cardapio;

public interface CardapioDAO extends Repository<Cardapio, Long> {

	public Cardapio findByIdCardapio(Long cardCod);

	public List<Cardapio> findAll();

	public Cardapio save(Cardapio cardapio);

}
