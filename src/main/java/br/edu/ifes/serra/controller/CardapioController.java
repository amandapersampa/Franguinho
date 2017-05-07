package br.edu.ifes.serra.controller;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifes.serra.model.entity.Cardapio;
import br.edu.ifes.serra.service.CardapioService;
import br.edu.ifes.serra.utils.builders.CardapioBuilder;

@RestController
@RequestMapping("cardapio")
public class CardapioController {

	@Autowired
	private CardapioService cardapioService;
	
	@RequestMapping(produces ="application/json", method=RequestMethod.GET)
	public Cardapio find() {
		Cardapio c = CardapioBuilder.build();
		c.setIdCardapio(1L);
		c.setItemCod(0L);
		return c;
	}
	
	@RequestMapping("/{cardCod}")
	public Cardapio findById(@PathVariable(name="cardCod", required=true) Long cardCod) {
		return cardapioService.findById(cardCod);
	}
	
	@RequestMapping("/list")
	public List<Cardapio> getList() {
		return cardapioService.getList();
	}
	
	@RequestMapping(name = "/", method = RequestMethod.POST)
	public Cardapio insert(@RequestBody @NotNull Cardapio cardapio) {
		return cardapioService.insert(cardapio);
	}
}
