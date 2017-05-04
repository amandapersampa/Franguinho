package br.edu.ifes.serra.model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.ifes.serra.model.dao.ItemEstoqueDAO;

@Entity(name = "ITEM_ESTOQUE")
public class ItemEstoque {

	@Autowired
	private static ItemEstoqueDAO ItemEstoqueDAO;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idItem;

	private String nome;

	private Integer quantidade;

	private String unidade;

	public Long getIdItem() {
		return idItem;
	}

	public void setIdItem(Long idItem) {
		this.idItem = idItem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	 public void delete() {
	 // TODO Auto-generated method stub
	
	 }
	 public ItemEstoque insert(ItemEstoque itemEstoque) {
	 return ItemEstoqueDAO.save(itemEstoque);
	
	 }
	
	 public void update() {
	 // TODO Auto-generated method stub
	
	 }
	
	 public static List<ItemEstoque> list() {
	 return ItemEstoqueDAO.findAll();
	 }

}
