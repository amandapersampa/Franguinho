package br.edu.ifes.serra.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Autowired
@JsonIgnore
@Transient
public @interface RepositorioVld {

}
