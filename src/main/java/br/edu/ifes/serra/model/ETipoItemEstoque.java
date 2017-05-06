package br.edu.ifes.serra.model;

import br.edu.ifes.serra.utils.Enums;

public enum ETipoItemEstoque implements Enums<Long> {
	PRODUTO(0L), ITEM_DIVERSO(1L), PRODUTO_EXTRA(2L);

	private final Long value;

	private ETipoItemEstoque(Long value) {
		this.value = value;
	}

	@Override
	public Long getValue() {
		return value;
	}
}
