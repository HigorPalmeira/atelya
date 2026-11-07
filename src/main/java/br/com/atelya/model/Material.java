package br.com.atelya.model;

import java.math.BigDecimal;

public class Material {
	
	private Long id;
	private TipoMaterial tipoMaterial;
	private Cor cor;
	private String nome;
	private String descricao;
	private Integer quantidade;
	private String unidadeMedida;
	private BigDecimal valor;
	
	public Material() {}
	
	public Material(Long id, TipoMaterial tipoMaterial, Cor cor, String nome, 
			String descricao, Integer quantidade, String unidadeMedida, BigDecimal valor) {
		this.id = id;
		this.tipoMaterial = tipoMaterial;
		this.cor = cor;
		this.nome = nome;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.unidadeMedida = unidadeMedida;
		this.valor = valor;
	}
	
	public Material(TipoMaterial tipoMaterial, Cor cor, String nome, String descricao, 
			Integer quantidade, String unidadeMedida, BigDecimal valor) {
		this.tipoMaterial = tipoMaterial;
		this.cor = cor;
		this.nome = nome;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.unidadeMedida = unidadeMedida;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoMaterial getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(TipoMaterial tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
