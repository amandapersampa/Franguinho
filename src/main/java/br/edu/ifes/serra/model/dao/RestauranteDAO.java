package br.edu.ifes.serra.model.dao;

import org.springframework.data.repository.Repository;

import br.edu.ifes.serra.model.entity.Restaurante;
import br.edu.ifes.serra.utils.Repositorio;

public interface RestauranteDAO extends Repositorio<Restaurante, Long>, Repository<Restaurante, Long> {

}
