package Quest�o_3;

import java.util.ArrayList;

import Quest�o_2.DespesaMes;

public class DespesasIndividuo 
{
	private ArrayList<DespesaMes> despesaMes; // Despesa mensal de um individuo
	
	// M�todo construtor
	
	public DespesasIndividuo( ArrayList<DespesaMes> despesaMes )
	{
		this.despesaMes = despesaMes;
	}
	
	/* 
		M�todo que recebe como par�metro o m�s de interesse e calcula a despesa mensal do individuo
		neste m�s espec�fico. Retorna um objeto do tipo DespesaMes 
	 */
	
	public DespesaMes totalizaMes( int mes )
	{	
		float valor = 0;
		
		/* 
			Estrutura de repeti��o para caminhar dentro da lista despesaMes, onde "despesa" que � do tipo
			DespesaMes ir� assumir o valor a cada posi��o da lista despesaMes
		 */
		
		for ( DespesaMes despesa : despesaMes )
		{	
			/*
				Estrutura condicional criada para realizar o somat�rio das despesas de um individuo,
				caso ele tenha uma despesa mensal no mes em quest�o
			 */
			
			if ( despesa.getMes() == mes )
			{
				valor += despesa.getValor();
			}
		}
		/* 
			Objeto criado do tipo DespesaMes com par�metros de mes e valor passados para o m�todo construtor
			de DespesaMes
		 */
		
		DespesaMes despesa = new DespesaMes(mes, valor);
		
		return despesa;
	}
}
