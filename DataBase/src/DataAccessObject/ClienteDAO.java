package DataAccessObject;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import DataAccessObject.Base.BaseDAO;
import Model.Cliente;
import Model.Produto;

public class ClienteDAO extends BaseDAO<Cliente>{

	public ClienteDAO(Connection connection) throws SQLException {
		super(connection);
	}

	@Override
	public Cliente findById(int id) throws SQLException {
		stmt = connection.prepareStatement("select * from cliente where id = ?");
		stmt.setInt(1, id);
		data = stmt.executeQuery();
		if(data.next()) {
			return  new Cliente(data.getInt(1), data.getString(2), data.getDate(3));
		}else {
			return null;
		}
	}

	@Override
	public ArrayList<Cliente> getAll() throws SQLException {
		var resultado = new ArrayList<Cliente>();
		data = statement.executeQuery("select * from cliente");
		while(data.next()) {
		   var cliente = new Cliente(data.getInt(1), data.getString(2), data.getDate(3));
		   resultado.add(cliente);
		}
		return resultado;
	}

	@Override
	public void save(Cliente cliente) throws SQLException {
		String sql = "insert into cliente(id, nome, dataNasc) values (?,?,?)";
		stmt = connection.prepareStatement(sql);
		stmt.setInt(1, cliente.getId());
		stmt.setString(2, cliente.getNome());
		stmt.setDate(3, (Date) cliente.getDataNascimento());
		stmt.execute();
		
	}

	@Override
	public void update(Cliente cliente) throws SQLException {
	
		
	}

	@Override
	public void delete(Cliente t) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
