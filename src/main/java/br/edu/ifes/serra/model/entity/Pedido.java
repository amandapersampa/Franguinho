package br.edu.ifes.serra.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.edu.ifes.serra.model.dao.PedidoDAO;
import br.edu.ifes.serra.utils.Entidade;
import br.edu.ifes.serra.utils.RepositorioVld;

@Entity(name = "PEDIDO")
public class Pedido extends Entidade<Pedido, Long> {

	@RepositorioVld
	private static PedidoDAO pedidoDAO;
	
	public Pedido(){
		super(pedidoDAO);
	}

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

	private static final long serialVersionUID = 1L;
}