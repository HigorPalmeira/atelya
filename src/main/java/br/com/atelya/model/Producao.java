package br.com.atelya.model;

import java.math.BigDecimal;
import java.sql.Date;

import br.com.atelya.model.enums.StatusProducao;

public class Producao {
	
	private Long id;
	private Peca peca;
	private Usuario usuario;
	private Integer tempoGasto;
	private BigDecimal pesoFinal;
	private Date data;
	private StatusProducao status;
	private String tamanho;
	
	public Producao() {}
	
	public Producao(Long id, Peca peca, Usuario usuario, Integer tempoGasto, BigDecimal pesoFinal, 
			Date data, StatusProducao status, String tamanho) {
		this.id = id;
		this.peca = peca;
		this.usuario = usuario;
		this.tempoGasto = tempoGasto;
		this.pesoFinal = pesoFinal;
		this.data = data;
		this.status = status;
		this.tamanho = tamanho;
	}
	
	public Producao(Peca peca, Usuario usuario, Integer tempoGasto, BigDecimal pesoFinal,
			Date data, StatusProducao status, String tamanho) {
		this.peca = peca;
		this.usuario = usuario;
		this.tempoGasto = tempoGasto;
		this.pesoFinal = pesoFinal;
		this.data = data;
		this.status = status;
		this.tamanho = tamanho;
	}
	
	public Producao(Peca peca, Integer tempoGasto, BigDecimal pesoFinal,
			Date data, StatusProducao status, String tamanho) {
		this.peca = peca;
		this.tempoGasto = tempoGasto;
		this.pesoFinal = pesoFinal;
		this.data = data;
		this.status = status;
		this.tamanho = tamanho;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Peca getPeca() {
		return peca;
	}

	public void setPeca(Peca peca) {
		this.peca = peca;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Integer getTempoGasto() {
		return tempoGasto;
	}

	public void setTempoGasto(Integer tempoGasto) {
		this.tempoGasto = tempoGasto;
	}

	public BigDecimal getPesoFinal() {
		return pesoFinal;
	}

	public void setPesoFinal(BigDecimal pesoFinal) {
		this.pesoFinal = pesoFinal;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public StatusProducao getStatus() {
		return status;
	}

	public void setStatus(StatusProducao status) {
		this.status = status;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
}
