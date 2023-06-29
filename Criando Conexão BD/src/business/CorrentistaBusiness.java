package business;

import java.util.ArrayList;

import interfaces.DAO;
import model.Correntista;

public class CorrentistaBusiness {

	private DAO<Correntista> dao;
	
	public CorrentistaBusiness( DAO<Correntista> dao )
	{
		this.dao = dao;
	}
	
	public boolean create( Correntista obj )
	{
		if ( obj.getNumCPF().length() == 11 &&
			 obj.getNome().length() != 0 )
		{
			dao.create(obj);
			return true;
		}
		return false;
	}
	
	public String showAllCorrentistas()
	{
		String saida = "";
		
		ArrayList<Correntista> correntistas = dao.read();
		
		for ( Correntista c : correntistas )
		{
			saida += c.getId() + " - " +
					 c.getNome() + " - " +
					 c.getNumCPF() + "\n";
		}
		return saida;
	}
}
