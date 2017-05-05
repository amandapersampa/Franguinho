package br.edu.ifes.serra.model.dao;

import org.springframework.data.repository.Repository;

import br.edu.ifes.serra.model.entity.ItemCardapio;
import br.edu.ifes.serra.utils.Repositorio;

public interface ItemCardapioDAO extends Repositorio<ItemCardapio, Long>, Repository<ItemCardapio, Long> {

}
