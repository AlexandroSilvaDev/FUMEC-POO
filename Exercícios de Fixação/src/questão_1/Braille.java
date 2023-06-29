package questão_1;

public class Braille {

	private int representacao[][];
	private String comunica;
	
	public Braille( String comunica )
	{
		representacao = new int[3][2];
		this.comunica = comunica;
		vazio();
	}
	
	public void alfabeto( String letra )
	{	
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
	
	public void converterString()
	{
		String letra;
		String imagem = "";
		
		for ( int x = 0 ; x < comunica.length() ; x++ )
		{
			letra = comunica.charAt(x) + "";
			alfabeto(letra);
			
			for ( int i = 0 ; i < 3 ; i++ )
			{				
				for ( int j = 0 ; j < 2 ; j++ )
				{
					imagem += "| " + representacao[i][j] + " |";
				}
				imagem += "\n";
			}
			System.out.println(imagem);
			imagem = "";
			vazio();
		}
	}
	
	public void vazio()
	{
		for ( int i = 0 ; i < 3 ; i++ )
		{
			for ( int j = 0 ; j < 2 ; j++ )
			{
				representacao[i][j] = 0;
			}
		}
	}
}
