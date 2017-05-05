package br.edu.ifes.serra.model.dao;

import org.springframework.data.repository.Repository;

import br.edu.ifes.serra.model.entity.Cardapio;
import br.edu.ifes.serra.utils.Repositorio;

public interface CardapioDAO extends Repositorio<Cardapio, Long>,  Repository<Cardapio, Long> {

}
