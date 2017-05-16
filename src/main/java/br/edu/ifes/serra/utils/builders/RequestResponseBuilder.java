package br.edu.ifes.serra.utils.builders;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class RequestResponseBuilder {
	public static <T> ResponseEntity<T> buildResponse(T o){
		return new ResponseEntity<>(o, HttpStatus.OK);
	}
}
