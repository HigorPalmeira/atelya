package br.com.atelya.model;

import java.math.BigDecimal;
import java.sql.Date;

public class Compra {
	
	private Long id;
	private Usuario usuario;
	private Date data;
	private BigDecimal valor;
	
	public Compra() {}
	
	public Compra(Long id, Usuario usuario, Date data, BigDecimal valor) {
		this.id = id;
		this.usuario = usuario;
		this.data = data;
		this.valor = valor;
	}
	
	public Compra(Usuario usuario, Date data, BigDecimal valor) {
		this.usuario = usuario;
		this.data = data;
		this.valor = valor;
	}
	
	public Compra(Date data, BigDecimal valor) {
		this.data = data;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
