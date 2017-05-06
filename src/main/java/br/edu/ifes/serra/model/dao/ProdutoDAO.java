package br.edu.ifes.serra.model.dao;

import org.springframework.data.repository.Repository;

import br.edu.ifes.serra.model.entity.Produto;
import br.edu.ifes.serra.utils.Repositorio;

public interface ProdutoDAO extends Repositorio<Produto, Long>, Repository<Produto, Long> {

}
