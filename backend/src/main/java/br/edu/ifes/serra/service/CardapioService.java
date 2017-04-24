package br.edu.ifes.serra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifes.serra.model.Cardapio;
import br.edu.ifes.serra.model.dao.CardapioDAO;

@Service
public class CardapioService {

	@Autowired
	private CardapioDAO cardapioDAO;
	
	
	public Cardapio findById(Long cardCod){
		return cardapioDAO.findByCardCod(cardCod);
	}
	
}
