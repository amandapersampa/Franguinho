package br.edu.ifes.serra.model.dao;

import org.springframework.data.repository.Repository;

import br.edu.ifes.serra.model.entity.Despesa;
import br.edu.ifes.serra.utils.Repositorio;

public interface DespesaDAO extends Repositorio<Despesa, Long>, Repository<Despesa, Long> {

}
