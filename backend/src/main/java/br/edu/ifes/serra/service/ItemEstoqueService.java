package br.edu.ifes.serra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifes.serra.model.ItemEstoque;

@Service
public class ItemEstoqueService {
	@Autowired
	private ItemEstoque itemEstoque;

	
	public List<ItemEstoque> getList() {
		return itemEstoque.list();
	}

	public ItemEstoque insert(ItemEstoque itemEstoque) {
		return itemEstoque.insert(itemEstoque);
	}
}
