package interfaces;

import java.util.ArrayList;

import model.Conta;

public interface DAO<T> {

	public void create( T obj );
	public ArrayList<T> read();
	public void update( T obj );
	public void delete( String id );
}
