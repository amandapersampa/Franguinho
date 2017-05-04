package br.edu.ifes.serra.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.ifes.serra.model.dao.ItemEstoqueDAO;

@Entity(name = "ItemEstoque")
public abstract class ItemEstoque implements ItemEstoqueInterface {

	@Id
	@GeneratedValue
	private Long IdItem;
	private String nome;
	private int quantidade;
	private String unidade;

	@Autowired
	private ItemEstoqueDAO ItemEstoqueDAO;

	public ItemEstoque() {
		super();
	}

	public Long getIdItem() {
		return IdItem;
	}

	public void setIdItem(Long idItem) {
		IdItem = idItem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public ItemEstoque insert(ItemEstoque itemEstoque) {
		return ItemEstoqueDAO.save(itemEstoque);

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ItemEstoque> list() {
		return ItemEstoqueDAO.findAll();
	}

}
