package br.edu.ifes.serra.controller;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifes.serra.model.entity.Cardapio;
import br.edu.ifes.serra.service.CardapioService;

@RestController
public class CardapioController {

	private final String url = "/cardapio";
	@Autowired
	private CardapioService cardapioService;
	
	@RequestMapping(produces ="application/json" ,name = url, method=RequestMethod.GET)
	public Cardapio find() {
		Cardapio c = new Cardapio();
		c.setIdCardapio(1L);
		c.setItemCod(0L);
		return c;
	}
	
	@RequestMapping(url+"/{cardCod}")
	public Cardapio findById(@PathVariable(name="cardCod", required=true) Long cardCod) {
		return cardapioService.findById(cardCod);
	}
	
	@RequestMapping(url+"/list")
	public List<Cardapio> getList() {
		return cardapioService.getList();
	}
	
	@RequestMapping(name = url+"/", method = RequestMethod.POST)
	public Cardapio insert(@RequestBody @NotNull Cardapio cardapio) {
		return cardapioService.insert(cardapio);
	}
}
