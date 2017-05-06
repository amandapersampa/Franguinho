package br.edu.ifes.serra.model;

import br.edu.ifes.serra.utils.Enums;

public enum ETipoItemCardapio implements Enums<Long> {
	BEDIDA(0L), PORCAO(1L), ACOMPANHAMENTO(2L);

	private final Long value;

	private ETipoItemCardapio(Long value) {
		this.value = value;
	}

	@Override
	public Long getValue() {
		return value;
	}

}
