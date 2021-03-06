package br.univel.cadastro.model;

import java.util.List;

public interface ClienteDao {
	
	public void inserir(Cliente c);
	public void atualizar(Cliente c);
	public void excluir(Cliente c);
	public Cliente buscar(int d);
	public Cliente buscarPorExemplo(Cliente c);
	public List<Cliente> lista();

}
