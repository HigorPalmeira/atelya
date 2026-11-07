package br.com.atelya.model;

import java.math.BigDecimal;

public class ItemVenda {
	
	private Venda venda;
	private Producao producao;
	private Integer quantidade;
	private BigDecimal valorUnitario;
	
	public ItemVenda() {}
	
	public ItemVenda(Venda venda, Producao producao, Integer quantidade, BigDecimal valorUnitario) {
		this.venda = venda;
		this.producao = producao;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public Producao getProducao() {
		return producao;
	}

	public void setProducao(Producao producao) {
		this.producao = producao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValor(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
}
