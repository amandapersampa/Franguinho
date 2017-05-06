package br.edu.ifes.serra.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.edu.ifes.serra.model.dao.RestauranteDAO;
import br.edu.ifes.serra.utils.Entidade;
import br.edu.ifes.serra.utils.RepositorioVld;

@Entity(name = "RESTAURANTE")
public class Restaurante extends Entidade<Restaurante, Long> {

	@RepositorioVld
	private static RestauranteDAO restauranteDAO;

	public Restaurante() {
		super(restauranteDAO);
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idRestaurante;

	private Long idDespesa;

	private Long idFuncionario;

	private Long idCardapio;

	public Long getIdRestaurante() {
		return idRestaurante;
	}

	public void setIdRestaurante(Long idRestaurante) {
		this.idRestaurante = idRestaurante;
	}

	public Long getIdDespesa() {
		return idDespesa;
	}

	public void setIdDespesa(Long idDespesa) {
		this.idDespesa = idDespesa;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Long idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public Long getIdCardapio() {
		return idCardapio;
	}

	public void setIdCardapio(Long idCardapio) {
		this.idCardapio = idCardapio;
	}

	private static final long serialVersionUID = 1L;
}
