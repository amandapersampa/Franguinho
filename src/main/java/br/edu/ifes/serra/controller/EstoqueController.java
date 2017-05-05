package br.edu.ifes.serra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifes.serra.model.ItemDiverso;
import br.edu.ifes.serra.model.entity.ItemEstoque;
import br.edu.ifes.serra.service.ItemEstoqueService;

@RestController
public class ItemEstoqueController {
//	private final String name = "/ItemEstoque";
//	@Autowired
//	private ItemEstoqueService itemService;
//
//	 @RequestMapping(name)
//	 public ItemEstoque find() {
//	 ItemDiverso c = new ItemDiverso();
//	 c.setNome("Coca-Cola");
//	 return c;
//	 }
//
//	// @RequestMapping(name + "/{idItem}")
//	// public ItemEstoque findById(@PathVariable(name = "idItem", required =
//	// true) Long cardCod) {
//	// return itemService.findById(idItem);
//	// }
//
//	@RequestMapping(name + "/list")
//	public List<ItemEstoque> getList() {  
//		return itemService.getList();
//	}
//
//	@RequestMapping(name + "/")
//	public String insert(@RequestBody ItemEstoque itemEstoque) {
//		itemService.insert(itemEstoque);
//
//		return "sucesso";
//	}
}
