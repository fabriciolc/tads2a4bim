package br.univel.cadastro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ClienteDaoH2Impl implements ClienteDao {

	
private static Connection con;
	
	private Connection getConnection() {
		
		synchronized (con) {
			if (con == null) {
				// TODO
			}
			return con;
		}
	}
	
	public void inserir(Cliente c) {
		String sql = "INSERT INTO....";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	@Override
	public void atualizar(Cliente c) {
		String sql = "UPDATE....";
		try(PreparedStatement ps = getConnection().prepareStatement(sql)){
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void excluir(Cliente c) {
		String sql = "INSERT INTO....";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Cliente buscar(int d) {
		String sql = "INSERT INTO....";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Cliente buscarPorExemplo(Cliente c) {
		String sql = "INSERT INTO....";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Cliente> lista() {
		String sql = "INSERT INTO....";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
