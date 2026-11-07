package br.com.atelya.model;

import java.math.BigDecimal;

public class MaterialCompra {
	
	private Material material;
	private Compra compra;
	private BigDecimal valorUnitario;
	private Integer quantidade;
	
	public MaterialCompra() {}
	
	public MaterialCompra(Material material, Compra compra, BigDecimal valorUnitario, Integer quantidade) {
		this.material = material;
		this.compra = compra;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
