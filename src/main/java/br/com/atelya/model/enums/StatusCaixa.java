package br.com.atelya.model.enums;

public enum StatusCaixa {
	
	PAGO("PAGO"),
	CANCELADO("CANCELADO"),
	SINAL_50_PER("SINAL 50%"),
	A_RECEBER("A RECEBER");
	
	private String descricao;
	
	StatusCaixa(String descricao) {
		this.descricao = descricao;
	}

}
