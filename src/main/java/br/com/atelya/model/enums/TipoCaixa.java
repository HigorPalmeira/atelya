package br.com.atelya.model.enums;

public enum TipoCaixa {
	
	ENTRADA("ENTRADA"),
	SAIDA("SAIDA");
	
	private String descricao;
	
	TipoCaixa(String descricao) {
		this.descricao = descricao;
	}

}
