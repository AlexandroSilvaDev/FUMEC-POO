package provaRaian;

import java.util.ArrayList;

import Quest�o_2.DespesaMes;
import Quest�o_3.CorrentistaDespesa;
import Quest�o_3.DespesasIndividuo;

public class Banco {

	private ArrayList<CorrentistaDespesa> despesas;
	
	public Banco( ArrayList<CorrentistaDespesa> despesas )
	{
		this.despesas.addAll(despesas);
	}
	
	public ArrayList<CorrentistaDespesa> validarSaldo( Correntista correntista, CorrentistaDespesa correntistaDespesa )
	{
		ArrayList<CorrentistaDespesa> aux = new ArrayList<CorrentistaDespesa>();
		
		for ( CorrentistaDespesa c : despesas )
		{
			if ( correntista.getSaldo() >= c.getDespesasPrevistas() )
			{
				aux.add(c);
			}
		}
		
		return aux;
	}
}
