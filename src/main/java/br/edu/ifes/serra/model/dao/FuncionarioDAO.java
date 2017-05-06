package br.edu.ifes.serra.model.dao;

import org.springframework.data.repository.Repository;

import br.edu.ifes.serra.model.entity.Funcionario;
import br.edu.ifes.serra.utils.Repositorio;

public interface FuncionarioDAO extends Repositorio<Funcionario, Long>, Repository<Funcionario, Long> {

}
