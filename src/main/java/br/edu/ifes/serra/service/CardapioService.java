package br.edu.ifes.serra.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.ifes.serra.model.entity.Cardapio;
import br.edu.ifes.serra.utils.builders.CardapioBuilder;

@Service
public class CardapioService {

	public Cardapio findById(Long cardCod) {
		return CardapioBuilder.build().findById(cardCod);
	}

	public List<Cardapio> getList() {
		return CardapioBuilder.build().getList();
	}

	public Cardapio insert(Cardapio cardapio) {
		return cardapio.insert();
	}

}
