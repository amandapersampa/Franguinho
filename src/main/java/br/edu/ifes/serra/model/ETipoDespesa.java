package br.edu.ifes.serra.model;

import br.edu.ifes.serra.utils.Enums;

public enum ETipoDespesa implements Enums<Long> {
	VARIAVEL(0L), FIXA(1L);

	private final Long value;

	private ETipoDespesa(Long value) {
		this.value = value;
	}

	@Override
	public Long getValue() {
		return value;
	}

}
