package Quest�o_2;

import java.util.ArrayList;

public class DespesaIndividual {
	
	private String CPF; // CPF 
	private ArrayList<DespesaMes> despesaMes; // lista de despesas por m�s
	
	// M�todo construtor
	
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
		M�todo que recebe como par�metro o m�s de interesse e calcula a despesa mensal do individuo
		neste m�s espec�fico. Retorna um objeto do tipo DespesaMes 
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
