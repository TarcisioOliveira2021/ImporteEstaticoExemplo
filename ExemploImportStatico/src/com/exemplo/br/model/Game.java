package com.exemplo.br.model;

public class Game {
	private String nome;
	private String produtora;
	private int codigoCatergoria;
	
	public Game(String nome, String produtora, int codigoCatergoria) {
		super();
		this.nome = nome;
		this.produtora = produtora;
		this.codigoCatergoria = codigoCatergoria;
	}

	//Métodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return produtora;
	}

	public void setAutor(String produtora) {
		this.produtora = produtora;
	}

	public int getCodigoCatergoria() {
		return codigoCatergoria;
	}

	public void setCodigoCatergoria(int codigoCatergoria) {
		this.codigoCatergoria = codigoCatergoria;
	}
	
	
}
