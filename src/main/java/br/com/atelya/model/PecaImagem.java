package br.com.atelya.model;

public class PecaImagem {
	
	private Long id;
	private Peca peca;
	private String url;
	private String tipoImagem;
	
	public PecaImagem() {}
	
	public PecaImagem(Long id, Peca peca, String url, String tipoImagem) {
		this.id = id;
		this.peca = peca;
		this.url = url;
		this.tipoImagem = tipoImagem;
	}
	
	public PecaImagem(Peca peca, String url, String tipoImagem) {
		this.peca = peca;
		this.url = url;
		this.tipoImagem = tipoImagem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Peca getPeca() {
		return peca;
	}

	public void setPeca(Peca peca) {
		this.peca = peca;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTipoImagem() {
		return tipoImagem;
	}

	public void setTipoImagem(String tipoImagem) {
		this.tipoImagem = tipoImagem;
	}

}
