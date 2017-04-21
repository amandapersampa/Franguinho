package br.edu.ifes.serra.controller;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifes.serra.model.Cardapio;
import br.edu.ifes.serra.service.CardapioService;

@RestController
public class CardapioController {

	@Autowired
	private CardapioService cardapioService;
	
	@RequestMapping("/{cardCod}")
	public Cardapio findById(@RequestParam @NotNull Long cardCod) {
		return cardapioService.findById(cardCod);
	}
}
