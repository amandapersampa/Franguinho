package br.edu.ifes.serra.utils;

import java.io.Serializable;
import java.util.List;

public interface Repositorio <T, U extends Serializable>{
	 T findOne(U id);

	 List<T> findAll();
	
	 Long count();

	 T save(T object);

	 void delete(T object);


}
