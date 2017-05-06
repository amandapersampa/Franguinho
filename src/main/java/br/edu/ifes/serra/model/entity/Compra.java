package br.edu.ifes.serra.model.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.edu.ifes.serra.model.dao.CompraDAO;
import br.edu.ifes.serra.utils.Entidade;
import br.edu.ifes.serra.utils.RepositorioVld;

@Entity(name = "COMPRA")
public class Compra extends Entidade<Compra, Long> {

	@RepositorioVld
	private static CompraDAO compraDAO;

	public Compra() {
		super(compraDAO);
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCompra;

	private Long produto;

	private Integer quantidade;

	private Date dia;

	public Long getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Long idCompra) {
		this.idCompra = idCompra;
	}

	public Long getProduto() {
		return produto;
	}

	public void setProduto(Long produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	@Override
	public String toString() {
		return "Compra [idCompra=" + idCompra + ", produto=" + produto + ", quantidade=" + quantidade + "]";
	}

	private static final long serialVersionUID = 1L;

}
