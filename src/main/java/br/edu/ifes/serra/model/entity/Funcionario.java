package br.edu.ifes.serra.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.edu.ifes.serra.model.dao.FuncionarioDAO;
import br.edu.ifes.serra.utils.Entidade;
import br.edu.ifes.serra.utils.RepositorioVld;

@Entity(name = "FUNCIONARIO")
public class Funcionario extends Entidade<Funcionario, Long> {

	@RepositorioVld
	private static FuncionarioDAO funcionarioDAO;
	
	public Funcionario(){
		super(funcionarioDAO);
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idFuncionario;

	private String nome;

	private Long telefone;

	private Long cpf;

	public Long getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Long idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	private static final long serialVersionUID = 1L;

}
