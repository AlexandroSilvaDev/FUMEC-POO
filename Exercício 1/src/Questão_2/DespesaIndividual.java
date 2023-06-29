package Questão_2;

import java.util.ArrayList;

public class DespesaIndividual {
	
	private String CPF; // CPF 
	private ArrayList<DespesaMes> despesaMes; // lista de despesas por mês
	
	// Método construtor
	
	public DespesaIndividual( String CPF, ArrayList<DespesaMes> despesaMes )
	{
		this.CPF = CPF;
		this.despesaMes = despesaMes;
	}
	
	// get retorna o CPF onde ele for executado
	
	public String getCpf()
	{
		return CPF;
	}
	
	/* 
		Método que recebe como parâmetro o mês de interesse e calcula a despesa mensal do individuo
		neste mês específico. Retorna um objeto do tipo DespesaMes 
	*/
	
	public DespesaMes totalizaMes( int mes )
	{
		/*float soma = 0;
		
		for ( int i = 0; i < despesaMes.size(); i++ )
		{
			if ( despesaMes.get(i).getMes() == mes )
			{
				soma += despesaMes.get(i).getValor();
			}
		}*/
		
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
