package br.com.dio.desafio.dominio;

public abstract class Conteudo {
	
	protected static final double XP_PADRAO = 10d;
	
	private String titulo;
	private String descricao;

	private double calcularXp;

	
	public abstract double calcularXp();

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

	public double getCalcularXp() {
		return calcularXp;
	}

	public void setCalcularXp(double calcularXp) {
		this.calcularXp = calcularXp;
	}

	public static double getXpPadrao() {
		return XP_PADRAO;
	}

	protected abstract Conteudo get();
	
	
	

}
