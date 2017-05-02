package br.edu.ifes.serra.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.ifes.serra.model.dao.CardapioDAO;

@Entity(name = "CARDAPIO")
public class Cardapio implements Serializable {

	@Autowired
	private static CardapioDAO cardapioDAO;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cardCod;

	private Long itemCod;

	public Long getCardCod() {
		return cardCod;
	}

	public void setCardCod(Long cardCod) {
		this.cardCod = cardCod;
	}

	public Long getItemCod() {
		return itemCod;
	}

	public void setItemCod(Long itemCod) {
		this.itemCod = itemCod;
	}

	public static Cardapio findById(Long cardCod) {
		return cardapioDAO.findByCardCod(cardCod);
	}

	public static List<Cardapio> getList() {
		return cardapioDAO.findAll();
	}

	public static Cardapio insert(Cardapio cardapio) {
		return cardapioDAO.save(cardapio);
	}

}
