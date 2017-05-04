package br.edu.ifes.serra.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.ifes.serra.model.entity.Cardapio;

@Service
public class CardapioService {

	public Cardapio findById(Long cardCod) {
		return Cardapio.findById(cardCod);
	}

	public List<Cardapio> getList() {
		return Cardapio.getList();
	}

	public Cardapio insert(Cardapio cardapio) {
		return Cardapio.insert(cardapio);
	}

}
