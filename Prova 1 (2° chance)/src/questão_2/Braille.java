package quest�o_2;

public class Braille {

	// atributo/caracteristica da abstra��o dos sinais em braille para o computador
	
	private int representacao[][];
	
	// metodo para criar a representa��o do braille computacionalmente
	
	public Braille()
	{
		representacao = new int[3][2];
		vazio();
	}
	
	// m�todo para utilizar de "dicionario" para traduzir letra por letra da linguagem recebida para Braille
	
	public void alfabeto( String letra )
	{
		/* 
			Analise de qual letra esta sendo recebida e tradu��o desta letra para o simbolo braille setando o valor
			1 nas posi��es referentes a cada letra
		 */
		
		if ( letra.equalsIgnoreCase("A") )
		{
			representacao[0][0] = 1;
		}
		else if ( letra.equalsIgnoreCase("B") )
		{
			representacao[0][0] = 1;
			representacao[1][0] = 1;
		}
		else if ( letra.equalsIgnoreCase("C") )
		{
			representacao[0][0] = 1;
			representacao[0][1] = 1;
		}
		else if ( letra.equalsIgnoreCase("D") )
		{
			representacao[0][0] = 1;
			representacao[0][1] = 1;
			representacao[1][1] = 1;
		}
		else if ( letra.equalsIgnoreCase("E") )
		{
			representacao[0][0] = 1;
			representacao[1][1] = 1;
		}
		else if ( letra.equalsIgnoreCase("F") )
		{
			representacao[0][0] = 1;
			representacao[0][1] = 1;
			representacao[1][0] = 1;
		}
		else if ( letra.equalsIgnoreCase("G") )
		{
			representacao[0][0] = 1;
			representacao[0][1] = 1;
			representacao[1][0] = 1;
			representacao[1][1] = 1;
		}
		else if ( letra.equalsIgnoreCase("H") )
		{
			representacao[0][0] = 1;
			representacao[1][0] = 1;
			representacao[1][1] = 1;
		}
		else if ( letra.equalsIgnoreCase("I") )
		{
			representacao[0][1] = 1;
			representacao[1][0] = 1;
		}
		else if ( letra.equalsIgnoreCase("J") )
		{
			representacao[0][1] = 1;
			representacao[1][0] = 1;
			representacao[1][1] = 1;
		}
		else if ( letra.equalsIgnoreCase("K") )
		{
			representacao[0][0] = 1;
			representacao[2][0] = 1;
		}
		else if ( letra.equalsIgnoreCase("L") )
		{
			representacao[0][0] = 1;
			representacao[1][0] = 1;
			representacao[2][0] = 1;
		}
		else if ( letra.equalsIgnoreCase("M") )
		{
			representacao[0][0] = 1;
			representacao[0][1] = 1;
			representacao[2][0] = 1;
		}
		else if ( letra.equalsIgnoreCase("N") )
		{
			representacao[0][0] = 1;
			representacao[0][1] = 1;
			representacao[1][1] = 1;
			representacao[2][0] = 1;
		}
		else if ( letra.equalsIgnoreCase("O") )
		{
			representacao[0][0] = 1;
			representacao[1][1] = 1;
			representacao[2][0] = 1;
		}
		else if ( letra.equalsIgnoreCase("P") )
		{
			representacao[0][0] = 1;
			representacao[0][1] = 1;
			representacao[1][0] = 1;
			representacao[2][0] = 1;
		}
		else if ( letra.equalsIgnoreCase("Q") )
		{
			representacao[0][0] = 1;
			representacao[0][1] = 1;
			representacao[1][0] = 1;
			representacao[1][1] = 1;
			representacao[2][0] = 1;
		}
		else if ( letra.equalsIgnoreCase("R") )
		{
			representacao[0][0] = 1;
			representacao[1][0] = 1;
			representacao[1][1] = 1;
			representacao[2][0] = 1;
		}
		else if ( letra.equalsIgnoreCase("S") )
		{
			representacao[0][1] = 1;
			representacao[1][0] = 1;
			representacao[2][0] = 1;
		}
		else if ( letra.equalsIgnoreCase("T") )
		{
			representacao[0][1] = 1;
			representacao[1][0] = 1;
			representacao[1][1] = 1;
			representacao[2][0] = 1;
		}
		else if ( letra.equalsIgnoreCase("U") )
		{
			representacao[0][0] = 1;
			representacao[2][0] = 1;
			representacao[2][1] = 1;
		}
		else if ( letra.equalsIgnoreCase("V") )
		{
			representacao[0][0] = 1;
			representacao[1][0] = 1;
			representacao[2][0] = 1;
			representacao[2][1] = 1;
		}
		else if ( letra.equalsIgnoreCase("W") )
		{
			representacao[0][1] = 1;
			representacao[1][0] = 1;
			representacao[1][1] = 1;
			representacao[2][1] = 1;
		}
		else if ( letra.equalsIgnoreCase("X") )
		{
			representacao[0][0] = 1;
			representacao[0][1] = 1;
			representacao[2][0] = 1;
			representacao[2][1] = 1;
		}
		else if ( letra.equalsIgnoreCase("Y") )
		{
			representacao[0][0] = 1;
			representacao[0][1] = 1;
			representacao[1][1] = 1;
			representacao[2][0] = 1;
			representacao[2][1] = 1;
		}
		else if ( letra.equalsIgnoreCase("Z") )
		{
			representacao[0][0] = 1;
			representacao[1][1] = 1;
			representacao[2][0] = 1;
			representacao[2][1] = 1;
		}
		
	}
	
	// m�todo para converter as letras recebidas na string digitada uma a uma em seu correspondente em Braille
	
	public String converter( String string )
	{
		String letra = "";
		String imagem = "";
		
		// for ir� percorrer a string digitada e converter cada letra para a sua correspondente em braille
		
		for ( int i = 0 ; i < string.length() ; i++ )
		{
			// Pegar letra a "letra da vez" da string recebida via parametro
			letra = string.charAt(i) + "";
			
			// Executando o m�todo acima para preencher as posi��es COM RELEVO de acordo com a letra atual
			alfabeto(letra); 
			
			/* For criado para exibir o sinal em braille correspondente a letra atual analisada 
			   (cria��o do simbolo referente a letra atual em an�lise)
			 */
			for ( int x = 0 ; x < 3 ; x++ )
			{
				for ( int j = 0 ; j < 2 ; j++ )
				{
					/*
						Uma string criada para formar o simbolo concatenando as posi��es da matriz
					 */
					imagem += "| " + representacao[x][j] + " |";
				}
				// Quebra de linha a cada 2 posi��es afim de reproduzir o modelo descrito no enunciado (braille)
				imagem += "\n";
			}
			
			// exibir o simbolo criado anteriormente no for
			System.out.println(imagem);
			
			/*
				Limpar a matriz para que possa ser feita uma nova representa��o sem resquicios da ultima 
			 */
			imagem = "";
		}
		return letra;
	}
	
	// m�todo criado para setar todas as posi��es da representa��o como SEM RELEVO
	
	public void vazio()
	{
		// For criado para percorrer a matriz e setar todas as posi��es com o valor 0 (SEM RELEVO)
	
		for ( int i = 0 ; i < 3 ; i++ )
		{
			for ( int j = 0 ; j < 2 ; j++ )
			{
				representacao[i][j] = 0;
			}
		}
	}
}
