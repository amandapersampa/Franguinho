package br.edu.ifes.serra.utils;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface Entidade<T> extends Serializable {

	@JsonIgnore
	public Entidade<T> findById(Serializable id);

	@JsonIgnore
	public void delete();

	@JsonIgnore
	public Entidade<T> insert();

	@JsonIgnore
	public Entidade<T> update();

	@JsonIgnore
	public List<T> getList();

}
