package br.edu.ifes.serra.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.edu.ifes.serra.model.dao.ItemCardapioDAO;
import br.edu.ifes.serra.utils.Entidade;
import br.edu.ifes.serra.utils.RepositorioVld;

@Entity(name = "ITEM_CARDAPIO")
public class ItemCardapio implements Entidade<ItemCardapio> {

	@RepositorioVld
	private static ItemCardapioDAO ItemCardapioDAO;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idItemCardapio;

	private Long eVldTipoItemCard;

	private String nome;

	private BigDecimal preco;

	public Long getIdItemCardapio() {
		return idItemCardapio;
	}

	public void setIdItemCardapio(Long idItemCardapio) {
		this.idItemCardapio = idItemCardapio;
	}

	public Long geteVldTipoItemCard() {
		return eVldTipoItemCard;
	}

	public void seteVldTipoItemCard(Long eVldTipoItemCard) {
		this.eVldTipoItemCard = eVldTipoItemCard;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	@Override
	public Entidade<ItemCardapio> findById(Serializable id) {
		return ItemCardapioDAO.findOne((Long) id);
	}

	@Override
	public void delete() {
		ItemCardapioDAO.delete(this);
	}

	@Override
	public Entidade<ItemCardapio> insert() {
		return ItemCardapioDAO.save(this);
	}

	@Override
	public Entidade<ItemCardapio> update() {
		return ItemCardapioDAO.save(this);
	}

	@Override
	public List<ItemCardapio> getList() {
		return ItemCardapioDAO.findAll();
	}

	private static final long serialVersionUID = 1L;
}
