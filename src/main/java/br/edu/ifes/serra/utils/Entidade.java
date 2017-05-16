package br.edu.ifes.serra.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class Entidade<T extends Entidade<T, ID>, ID extends Serializable> implements Serializable {

	private static final long serialVersionUID = 1L;

	private final Repositorio<T, ID> repo;
	
	
	protected Entidade(Repositorio<T, ID> repo){
		this.repo = repo;
	}
	
	@JsonIgnore
	public T findById(ID id) {
		return repo.findOne(id);
	}
	
	@SuppressWarnings("unchecked")
	@JsonIgnore
	public void delete(){
		repo.delete((T) this);
	}

	@SuppressWarnings("unchecked")
	@JsonIgnore
	public T insert() {
		return repo.save((T) this);
	}

	@SuppressWarnings("unchecked")
	@JsonIgnore
	public T update() {
		return repo.save((T) this);
	}

	@JsonIgnore
	public List<T> getList() {
		return repo.findAll();
	}

}
