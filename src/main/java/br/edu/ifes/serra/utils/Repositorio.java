package br.edu.ifes.serra.utils;

import java.io.Serializable;
import java.util.List;

public interface Repositorio <T, U extends Serializable>{
	public T findOne(U id);

	public List<T> findAll();
	
	Long count();

	public T save(T object);

	public void delete(T object);


}
