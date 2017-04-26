package br.edu.ifes.serra.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name = "CARDAPIO")
public class Cardapio implements Serializable {

	@Id
	@GeneratedValue
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

}
