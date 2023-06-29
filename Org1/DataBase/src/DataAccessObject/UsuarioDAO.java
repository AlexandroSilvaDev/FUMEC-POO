package DataAccessObject;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import DataAccessObject.Base.BaseDAO;
import Model.Cliente;
import Model.Produto;
import Model.Usuario;

public class UsuarioDAO extends BaseDAO<Usuario>{

	public UsuarioDAO(Connection connection) throws SQLException {
		super(connection);
	}
	
	public Usuario findByLoginAndPass( String login, String password) throws SQLException {
		stmt = connection.prepareStatement("select * from usuario where login = ? and password = ?");
		stmt.setString(1, login);
		stmt.setString(2, password);
		data = stmt.executeQuery();
		if(data.next()) {
			return  new Usuario(data.getInt(1), data.getString(2), data.getString(3), data.getString(4));
		}else {
			return null;
		}
	}

	@Override
	public Usuario findById(int id) throws SQLException {
		stmt = connection.prepareStatement("select * from usuario where id = ?");
		stmt.setInt(1, id);
		data = stmt.executeQuery();
		if(data.next()) {
			return  new Usuario(data.getInt(1), data.getString(2), data.getString(3), data.getString(4));
		}else {
			return null;
		}
	}

	@Override
	public ArrayList<Usuario> getAll() throws SQLException {
		var resultado = new ArrayList<Usuario>();
		data = statement.executeQuery("select * from usuario");
		while(data.next()) {
		   var ususario = new Usuario(data.getInt(1), data.getString(2), data.getString(3), data.getString(4));
		   resultado.add(ususario);
		}
		return resultado;
	}

	@Override
	public void save(Usuario t) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Usuario t) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Usuario t) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
