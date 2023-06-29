package DataAccessObject.Base;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class BaseDAO<T> implements DAO<T>{
	
	protected Connection connection;
	protected Statement statement;
	protected ResultSet data;
	protected PreparedStatement stmt;
	
	public BaseDAO(Connection connection) throws SQLException{
		this.connection = connection;
		this.statement = this.connection.createStatement();
	}
}
