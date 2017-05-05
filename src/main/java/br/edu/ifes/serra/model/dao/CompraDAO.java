package br.edu.ifes.serra.model.dao;

import org.springframework.data.repository.Repository;

import br.edu.ifes.serra.model.entity.Compra;
import br.edu.ifes.serra.utils.Repositorio;

public interface CompraDAO extends Repositorio<Compra, Long>,  Repository<Compra, Long> {

}
