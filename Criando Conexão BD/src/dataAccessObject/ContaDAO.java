package dataAccessObject;

import java.util.ArrayList;

import interfaces.DAO;
import model.Conta;

public class ContaDAO implements DAO<Conta> {

	private ArrayList<Conta> dadosConta = new ArrayList<Conta>();
	
	// CREATE
	
	public void create( Conta obj )
	{
		dadosConta.add(obj);
	}
	
	// READ
	
	public ArrayList<Conta> read()
	{
		return dadosConta;
	}
	
	// UPDATE
	
	public void update( Conta obj )
	{
		for ( Conta c : dadosConta )
		{
			if ( c.getId() == obj.getId() )
			{
				c = obj;
			}
		}
	}
	
	// DELETE
	
	public void delete( String id )
	{
		ArrayList<Conta> toRemove = new ArrayList<Conta>();
		
		for ( Conta c : dadosConta )
		{
			if ( c.getId() == id )
			{
				toRemove.add(c);
			}
		}
		dadosConta.removeAll(toRemove);
	}
}
