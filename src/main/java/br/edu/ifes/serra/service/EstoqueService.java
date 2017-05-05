package br.edu.ifes.serra.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.ifes.serra.model.entity.Produto;
import br.edu.ifes.serra.utils.builders.ProdutoBuilder;

@Service
public class EstoqueService {

	public Produto findById(Long idItem) {
		return ProdutoBuilder.build().findById(idItem);
	}
	
	public List<Produto> getList() {
		return ProdutoBuilder.build().getList();
	}

	public Produto insert(Produto itemEstoque) {
		return itemEstoque.insert();
	}
}
