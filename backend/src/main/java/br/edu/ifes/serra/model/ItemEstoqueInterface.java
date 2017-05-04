package br.edu.ifes.serra.model;

import java.util.List;

public interface ItemEstoqueInterface {
	public void delete();

	public ItemEstoque insert(ItemEstoque itemEstoque);

	public void update();

	public List<ItemEstoque> list();
}
