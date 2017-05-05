package br.edu.ifes.serra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifes.serra.model.entity.Produto;
import br.edu.ifes.serra.service.EstoqueService;

@RestController
public class EstoqueController {
	private final String name = "/estoque";
	@Autowired
	private EstoqueService itemService;

	@RequestMapping(name)
	public Produto find() {
		Produto c = new Produto();
		c.setNome("Coca-Cola");
		return c;
	}

	@RequestMapping(name + "/{idItem}")
	public Produto findById(@PathVariable(name = "idItem", required = true) Long idItem) {
		return itemService.findById(idItem);
	}

	@RequestMapping(name + "/list")
	public List<Produto> getList() {
		return itemService.getList();
	}

	@RequestMapping(name + "/")
	public String insert(@RequestBody Produto itemEstoque) {
		itemService.insert(itemEstoque);

		return "sucesso";
	}
}
