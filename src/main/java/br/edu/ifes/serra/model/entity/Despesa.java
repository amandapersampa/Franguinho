package br.edu.ifes.serra.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.edu.ifes.serra.model.dao.DespesaDAO;
import br.edu.ifes.serra.utils.Entidade;
import br.edu.ifes.serra.utils.RepositorioVld;

@Entity(name = "DESPESA")
public class Despesa implements Entidade<Despesa> {

	@RepositorioVld
	private static DespesaDAO despesaDAO;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idDespesa;

	private Date dataPagamento;

	private Date dataVencimento;

	private Long vldTipoDespesa;

	public Long getIdDespesa() {
		return idDespesa;
	}

	public void setIdDespesa(Long idDespesa) {
		this.idDespesa = idDespesa;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Long getVldTipoDespesa() {
		return vldTipoDespesa;
	}

	public void setVldTipoDespesa(Long vldTipoDespesa) {
		this.vldTipoDespesa = vldTipoDespesa;
	}

	@Override
	public Entidade<Despesa> findById(Serializable id) {
		return despesaDAO.findOne((Long) id);
	}

	@Override
	public void delete() {
		despesaDAO.delete(this);
	}

	@Override
	public Despesa insert() {
		return despesaDAO.save(this);
	}

	@Override
	public Despesa update() {
		return despesaDAO.save(this);
	}

	@Override
	public List<Despesa> getList() {
		return despesaDAO.findAll();
	}

	private static final long serialVersionUID = 1L;

}
