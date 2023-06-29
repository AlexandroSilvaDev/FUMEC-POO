package dataAccessObject;

import java.util.ArrayList;

import interfaces.DAO;
import model.Correntista;

public class CorrentistaDAO implements DAO<Correntista> {

	private ArrayList<Correntista> correntistas = new ArrayList<Correntista>();
	
	// CREATE
	
	@Override
	public void create(Correntista obj) 
	{
		correntistas.add(obj);
	}

	// READ
	
	@Override
	public ArrayList<Correntista> read() 
	{
		return correntistas;
	}

	// UPDATE
	
	@Override
	public void update(Correntista obj) 
	{
		for ( Correntista c : correntistas )
		{
			if ( obj.getId() == c.getId() )
			{
				c = obj;
			}
		}
	}
	
	// DELETE
	
	public void delete( String id )
	{
		ArrayList<Correntista> toRemove = new ArrayList<Correntista>();
		
		for ( Correntista c : correntistas )
		{
			if ( id == c.getId() )
			{
				toRemove.add(c);
			}
		}
		correntistas.removeAll(toRemove);
	}
}
