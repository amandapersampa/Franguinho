package br.edu.ifes.serra.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;

import br.edu.ifes.serra.model.dao.CardapioDAO;

@Entity
@Table(name = "CARDAPIO")
public class Cardapio implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
    private Long id;
	
	@Autowired
	private static CardapioDAO cardapioDAO; 
	
	public static Cardapio findById(Long cardCod){
		return cardapioDAO.findById(cardCod);
	}
	
}
