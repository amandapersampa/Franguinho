package br.edu.ifes.serra.model.dao;

import org.springframework.data.repository.Repository;

import br.edu.ifes.serra.model.entity.Pedido;
import br.edu.ifes.serra.utils.Repositorio;

public interface PedidoDAO  extends Repositorio<Pedido, Long>, Repository<Pedido, Long> {

}
