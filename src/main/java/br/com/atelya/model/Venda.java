package br.com.atelya.model;

import java.math.BigDecimal;
import java.sql.Date;

import br.com.atelya.model.enums.StatusVenda;

public class Venda {
	
	private Long id;
	private Cliente cliente;
	private Usuario usuario;
	private Date data;
	private BigDecimal valor;
	private StatusVenda status;
	
	public Venda() {}
	
	public Venda(Long id, Cliente cliente, Usuario usuario, Date data, BigDecimal valor, StatusVenda status) {
		this.id = id;
		this.cliente = cliente;
		this.usuario = usuario;
		this.data = data;
		this.valor = valor;
		this.status = status;
	}
	
	public Venda(Cliente cliente, Usuario usuario, Date data, BigDecimal valor, StatusVenda status) {
		this.cliente = cliente;
		this.usuario = usuario;
		this.data = data;
		this.valor = valor;
		this.status = status;
	}
	
	public Venda(Cliente cliente, Date data, BigDecimal valor, StatusVenda status) {
		this.cliente = cliente;
		this.data = data;
		this.valor = valor;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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

	public StatusVenda getStatus() {
		return status;
	}

	public void setStatus(StatusVenda status) {
		this.status = status;
	}
	
}
