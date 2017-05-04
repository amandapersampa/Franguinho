package br.edu.ifes.serra.model.entity;

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
	private Long idCardapio;

	private Long itemCod;

	public Long getIdCardapio() {
		return idCardapio;
	}

	public void setIdCardapio(Long idCardapio) {
		this.idCardapio = idCardapio;
	}

	public Long getItemCod() {
		return itemCod;
	}

	public void setItemCod(Long itemCod) {
		this.itemCod = itemCod;
	}

	public static Cardapio findById(Long cardCod) {
		return cardapioDAO.findByIdCardapio(cardCod);
	}

	public static List<Cardapio> getList() {
		return cardapioDAO.findAll();
	}

	public static Cardapio insert(Cardapio cardapio) {
		return cardapioDAO.save(cardapio);
	}

}
