package br.univel.cadastro.model;

public enum Uf {
	PR("Paran�"),
	SP("S�o Paulo"),
	SC("Santa Catarina");

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	private Uf(String nome) {
		this.nome = nome;
	}
	
}
