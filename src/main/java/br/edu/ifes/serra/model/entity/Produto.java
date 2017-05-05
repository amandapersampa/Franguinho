package br.edu.ifes.serra.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.edu.ifes.serra.model.dao.ProdutoDAO;
import br.edu.ifes.serra.utils.Entidade;
import br.edu.ifes.serra.utils.RepositorioVld;

@Entity(name = "PRODUTO")
public class Produto extends Entidade<Produto, Long> {

	@RepositorioVld
	private static ProdutoDAO produtoDAO;

	public Produto() {
		super(produtoDAO);
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idProduto;

	private String nome;

	private Integer quantidade;

	private String unidade;

	private Long itemEstoqueVld;

	public Long getItemEstoqueVld() {
		return itemEstoqueVld;
	}

	public void setItemEstoqueVld(Long itemEstoqueVld) {
		this.itemEstoqueVld = itemEstoqueVld;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
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

	private static final long serialVersionUID = 1L;

}
