package br.edu.ifes.serra.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.edu.ifes.serra.model.dao.CardapioDAO;
import br.edu.ifes.serra.utils.Entidade;
import br.edu.ifes.serra.utils.RepositorioVld;

@Entity(name = "CARDAPIO")
public class Cardapio implements Entidade<Cardapio> {
	
	@RepositorioVld
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

	@Override
	public Cardapio findById(Serializable id) {
		return cardapioDAO.findOne((Long) id);
	}

	@Override
	public void delete() {
		cardapioDAO.delete(this);
	}

	@Override
	public Cardapio insert() {
		return cardapioDAO.save(this);
	}

	@Override
	public Cardapio update() {
		return cardapioDAO.save(this);
	}

	@Override
	public List<Cardapio> getList() {
		return cardapioDAO.findAll();
	}

	@Override
	public String toString() {
		return "Cardapio [idCardapio=" + idCardapio + ", itemCod=" + itemCod + "]";
	}
	
	private static final long serialVersionUID = 1L;
}
