package br.edu.ifes.serra.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.edu.ifes.serra.model.dao.PedidoDAO;
import br.edu.ifes.serra.utils.Entidade;
import br.edu.ifes.serra.utils.RepositorioVld;

@Entity(name = "PEDIDO")
public class Pedido implements Entidade<Pedido> {

	@RepositorioVld
	private static PedidoDAO pedidoDAO;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idPedido;

	private Long idItemCardapio;
	
	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public Long getIdItemCardapio() {
		return idItemCardapio;
	}

	public void setIdItemCardapio(Long idItemCardapio) {
		this.idItemCardapio = idItemCardapio;
	}

	@Override
	public Entidade<Pedido> findById(Serializable id) {
		return pedidoDAO.findOne((Long) id);
	}

	@Override
	public void delete() {
		pedidoDAO.delete(this);
	}

	@Override
	public Entidade<Pedido> insert() {
		return pedidoDAO.save(this);
	}

	@Override
	public Entidade<Pedido> update() {
		return pedidoDAO.save(this);
	}

	@Override
	public List<Pedido> getList() {
		return pedidoDAO.findAll();
	}

	private static final long serialVersionUID = 1L;
}