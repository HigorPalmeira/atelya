package br.com.atelya.model;

public class PecaMaterial {
	
	private Producao producao;
	private Material material;
	private Integer quantidade;
	
	public PecaMaterial() {}
	
	public PecaMaterial(Producao producao, Material material, Integer quantidade) {
		this.producao = producao;
		this.material = material;
		this.quantidade = quantidade;
	}

	public Producao getProducao() {
		return producao;
	}

	public void setProducao(Producao producao) {
		this.producao = producao;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
}
