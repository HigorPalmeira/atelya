package br.com.atelya.model;

import java.math.BigDecimal;
import java.sql.Date;

import br.com.atelya.model.enums.StatusCaixa;
import br.com.atelya.model.enums.TipoCaixa;

public class Caixa {
	
	private Long id;
	private CategoriaCaixa categoriaCaixa;
	private Compra compra;
	private Venda venda;
	private TipoCaixa tipo;
	private StatusCaixa status;
	private BigDecimal valor;
	private Date data;
	
	public Caixa() {}
	
	public Caixa(Long id, CategoriaCaixa categoriaCaixa, Compra compra, Venda venda, 
			TipoCaixa tipo, StatusCaixa status, BigDecimal valor, Date data) {
		this.id = id;
		this.categoriaCaixa = categoriaCaixa;
		this.compra = compra;
		this.venda = venda;
		this.tipo = tipo;
		this.status = status;
		this.valor = valor;
		this.data = data;
	}
	
	public Caixa(CategoriaCaixa categoriaCaixa, Compra compra, TipoCaixa tipo, StatusCaixa status, 
			BigDecimal valor, Date data) {
		this.categoriaCaixa = categoriaCaixa;
		this.compra = compra;
		this.tipo = tipo;
		this.status = status;
		this.valor = valor;
		this.data = data;
	}
	
	public Caixa(CategoriaCaixa categoriaCaixa, Venda venda, TipoCaixa tipo, StatusCaixa status, 
			BigDecimal valor, Date data) {
		this.categoriaCaixa = categoriaCaixa;
		this.venda = venda;
		this.tipo = tipo;
		this.status = status;
		this.valor = valor;
		this.data = data;
	}
	
	public Caixa(CategoriaCaixa categoriaCaixa, TipoCaixa tipo, StatusCaixa status, BigDecimal valor, Date data) {
		this.categoriaCaixa = categoriaCaixa;
		this.tipo = tipo;
		this.status = status;
		this.valor = valor;
		this.data = data;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CategoriaCaixa getCategoriaCaixa() {
		return categoriaCaixa;
	}

	public void setCategoriaCaixa(CategoriaCaixa categoriaCaixa) {
		this.categoriaCaixa = categoriaCaixa;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public TipoCaixa getTipo() {
		return tipo;
	}

	public void setTipo(TipoCaixa tipo) {
		this.tipo = tipo;
	}

	public StatusCaixa getStatus() {
		return status;
	}

	public void setStatus(StatusCaixa status) {
		this.status = status;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
