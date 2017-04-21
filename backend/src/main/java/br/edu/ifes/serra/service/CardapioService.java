package br.edu.ifes.serra.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.ifes.serra.model.Cardapio;

@Service
public class CardapioService {

	@Transactional(rollbackFor = Exception.class)
	public Cardapio findById(Long cardCod){
		return Cardapio.findById(cardCod);
	}
}
