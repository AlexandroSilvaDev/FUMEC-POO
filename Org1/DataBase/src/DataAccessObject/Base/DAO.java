package DataAccessObject.Base;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DAO<T> {
	T findById(int id) throws SQLException;	
    ArrayList<T> getAll() throws SQLException;
    void save(T t) throws SQLException;
    void update(T t) throws SQLException;
    void delete(T t) throws SQLException;
}
