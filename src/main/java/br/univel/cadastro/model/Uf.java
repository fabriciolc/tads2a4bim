package br.univel.cadastro.model;

public enum Uf {
	PR("Paraná"),
	SP("São Paulo"),
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
