package business;

import java.util.ArrayList;

import dataAccessObject.ContaDAO;
import interfaces.DAO;
import model.Conta;

public class ContaBusiness {
	
	private DAO<Conta> dao;
	
	public ContaBusiness( DAO<Conta> dao )
	{
		this.dao = dao;
	}
	
	public boolean create( Conta conta )
	{
		if ( conta.getValorSaldo() > 100 )
		{
			dao.create(conta);
			return true;
		}
		return false;
	}
	
	public boolean saque( String numConta, double valor )
	{
		ArrayList<Conta> contas = dao.read();
		Conta conta = getConta(numConta, contas);
		
		if ( conta != null && conta.getValorSaldo() >= valor )
		{
			conta.setValorSaldo(conta.getValorSaldo() - valor);
			dao.update(conta);
			return true;
		}
		return false;
	}
	
	public String showAllContas()
	{
		String saida = "";
		
		ArrayList<Conta> contas = dao.read();
		
		for ( Conta conta : contas )
		{
			saida += conta.getNumConta() + " - " + 
				     conta.getValorSaldo() + "\n";
		}
		return saida;
	}
	
	public double deposito( int numConta, double valor )
	{
		return 0;
	}
	
	public Conta getConta( String numConta, ArrayList<Conta> contas )
	{
		for ( Conta conta : contas )
		{
			if ( conta.getNumConta() == numConta )
			{
				return conta;
			}
		}
		return null;
	}
}
