package br.com.atelya.model.enums;

public enum StatusVenda {
	
	PENDENTE("PENDENTE"),
	EM_PRODUCAO("EM PRODUÇÃO"),
	FINALIZADA("FINALIZADA"),
	ENTREGUE("ENTREGUE"),
	CANCELADA("CANCELADA");
	
	private String descricao;
	
	StatusVenda(String descricao) {
		this.descricao = descricao;
	}

}
