package DataAccessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DataAccessObject.Base.BaseDAO;
import DataAccessObject.Base.DAO;
import Model.Produto;

public class ProdutoDAO extends BaseDAO<Produto>{

	public ProdutoDAO(Connection connection) throws SQLException{
		super(connection);
	}
	
	@Override
	public ArrayList<Produto> getAll() throws SQLException {
		var resultado = new ArrayList<Produto>();
		data = statement.executeQuery("select * from produto");
		while(data.next()) {
		   var produto = new Produto(data.getInt(1), data.getString(2), data.getFloat(3));
		   resultado.add(produto);
		}
		return resultado;
	}

	@Override
	public void save(Produto produto) throws SQLException {
		String sql = "insert into produto(id, descricao, preco) values (?,?,?)";
		stmt = connection.prepareStatement(sql);
		stmt.setInt(1, produto.getId());
		stmt.setString(2, produto.getDescricao());
		stmt.setFloat(3, produto.getPreco());
		stmt.execute();
		
	}

	@Override
	public void update(Produto produto) throws SQLException {
		String sql = "update produto set descricao = (?), preco = (?) where id = (?)";
		stmt = connection.prepareStatement(sql);
		stmt.setString(1, produto.getDescricao());
		stmt.setFloat(2, produto.getPreco());
		stmt.setInt(3, produto.getId());
		stmt.execute();
		
	}

	@Override
	public void delete(Produto produto) throws SQLException {
		String sql = "delete from produto where id = (?)";
		stmt = connection.prepareStatement(sql);
		stmt.setInt(1, produto.getId());
		stmt.execute();
	}

	@Override
	public Produto findById(int id) throws SQLException {
		stmt = connection.prepareStatement("select * from produto where id = ?");
		stmt.setInt(1, id);
		data = stmt.executeQuery();
		if(data.next()) {
			return  new Produto(data.getInt(1), data.getString(2), data.getFloat(3));
		}else {
			return null;
		}
	}

}
