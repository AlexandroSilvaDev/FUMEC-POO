package quest�o_4;

import quest�o_3.Data;

public class V�o {
	
	private int cadeiras[];
	private String numeroVoo;
	private Data dataVoo;
	private String horaVoo;
	
	public V�o( String numeroVoo, Data data )
	{
		cadeiras = new int[100];
		this.numeroVoo = numeroVoo;
		this.dataVoo = data;
	}
	
	public int proximoLivre()
	{
		for ( int i = 0 ; i < 100 ; i++ )
		{
			if ( cadeiras[i] != 1 )
			{
				System.out.println("\nO n�mero da pr�xima cadeira livre �: " + (i + 1) );
				return i + 1;
			}
		}
		return -1;
	}
	
	public boolean verifica( int numCadeira )
	{
		if ( cadeiras[numCadeira] == 1 )
		{
			System.out.println("\nCadeira ocupada!");
			return true;
		}
		else {
			System.out.println("\nCadeira vaga!");
			return false;
		}
	}
	
	public boolean ocupa( int numCadeira )
	{
		if ( ! verifica( numCadeira ) )
		{
			cadeiras[numCadeira] = 1;
			System.out.println("\nOpera��o foi bem sucedida.");
			return true;
		}
		return false;
	}
	
	public int vagas()
	{
		int cadeirasVagas = 0;
		
		for ( int i = 0 ; i < 100 ; i++ )
		{
			if ( ! verifica(i) )
			{
				cadeirasVagas++;
			}
		}
		return cadeirasVagas;
	}

	public String getNumeroVoo() {
		return numeroVoo;
	}
	
	
}
