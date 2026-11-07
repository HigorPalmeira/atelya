package br.com.atelya.model.enums;

public enum StatusProducao {
	
	PENDENTE("PENDENTE"),
	EM_PRODUCAO("EM PRODUÇÃO"),
	FINALIZADA("FINALIZADA"),
	CANCELADA("CANCELADA"),
	DESPACHADA("DESPACHADA");
	
	private String descricao;
	
	StatusProducao(String descricao) {
		this.descricao = descricao;
	}

}
