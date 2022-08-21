package br.com.dio.desafio.dominio;

public abstract class Conteudo { // abstract = classe n�o pode ser instanciada
	
	protected static final double XP_PADRAO = 10;
	
	// Atributos
	
	private String titulo;
	private String descricao;
	
	// Métodos
	
	public abstract double calcularXP();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
