package Questão_3;

import java.util.ArrayList;

import Questão_2.DespesaMes;

public class DespesasIndividuo 
{
	private ArrayList<DespesaMes> despesaMes; // Despesa mensal de um individuo
	
	// Método construtor
	
	public DespesasIndividuo( ArrayList<DespesaMes> despesaMes )
	{
		this.despesaMes = despesaMes;
	}
	
	/* 
		Método que recebe como parâmetro o mês de interesse e calcula a despesa mensal do individuo
		neste mês específico. Retorna um objeto do tipo DespesaMes 
	 */
	
	public DespesaMes totalizaMes( int mes )
	{	
		float valor = 0;
		
		/* 
			Estrutura de repetição para caminhar dentro da lista despesaMes, onde "despesa" que é do tipo
			DespesaMes irá assumir o valor a cada posição da lista despesaMes
		 */
		
		for ( DespesaMes despesa : despesaMes )
		{	
			/*
				Estrutura condicional criada para realizar o somatório das despesas de um individuo,
				caso ele tenha uma despesa mensal no mes em questão
			 */
			
			if ( despesa.getMes() == mes )
			{
				valor += despesa.getValor();
			}
		}
		/* 
			Objeto criado do tipo DespesaMes com parâmetros de mes e valor passados para o método construtor
			de DespesaMes
		 */
		
		DespesaMes despesa = new DespesaMes(mes, valor);
		
		return despesa;
	}
}
