package br.edu.ifes.serra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifes.serra.model.Cardapio;
import br.edu.ifes.serra.service.CardapioService;

@RestController
public class CardapioController {

	private final String name = "/cardapio";
	@Autowired
	private CardapioService cardapioService;
	
	@RequestMapping(name)
	public Cardapio find() {
		Cardapio c = new Cardapio();
		c.setCardCod(1L);
		return c;
	}
	
	@RequestMapping(name+"/{cardCod}")
	public Cardapio findById(@PathVariable(name="cardCod", required=true) Long cardCod) {
		return cardapioService.findById(cardCod);
	}
	
	@RequestMapping(name+"/list")
	public List<Cardapio> getList() {
		return cardapioService.getList();
	}
	
	@RequestMapping(name+"/")
	public Cardapio insert(@RequestBody Cardapio cardapio) {
		return cardapioService.insert(cardapio);
	}
}
