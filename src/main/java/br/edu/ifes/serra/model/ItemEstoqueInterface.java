package br.edu.ifes.serra.model;

import java.util.List;

public interface ItemEstoqueInterface {
	public void delete();

	public ItemEstoqueInterface insert(ItemEstoqueInterface itemEstoque);

	public void update();

	public List<ItemEstoqueInterface> list();
}
