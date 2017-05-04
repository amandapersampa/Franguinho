package br.edu.ifes.serra.model.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import br.edu.ifes.serra.model.ItemEstoque;

public interface ItemEstoqueDAO extends Repository<ItemEstoque, Long> {

	public ItemEstoque findByIdItem(Long cod);

	public List<ItemEstoque> findAll();

	public ItemEstoque save(ItemEstoque itemEstoque);

}
