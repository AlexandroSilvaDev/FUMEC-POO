package questão_5;

public class Prova {

	private char prova[];
	private char resposta;
	
	public Prova( Gabarito gabaritoProva )
	{
		prova = new char[15];
	}
	
	public void respostaAluno( char resposta )
	{
		for ( int i = 0 ; i < 15 ; i++ )
		{
			if ( prova[i] < 'A' || prova[i] > 'E' )
			{
				prova[i] = resposta;
				break;
			}
		}
	}
	
	public int acertos()
	{
		int acerto;
		
		for ( int i = 0 ; i < 15 ; i++ )
		{
			if ( respostaQuestao(i) == prova[i] )
			{
				acerto++;
			}
		}
		return acerto;
	}
	
	public float nota()
	{
		float nota = 0;
		
		for ( int i = 0 ; i < 15 ; i++ )
		{
			if ( ( i >= 0 && i < 10 ) && respostaQuestao(i) == prova[i] )
			{
				nota += 0.5f;
			}
			else if ( i >= 10 && respostaQuestao(i) == prova[i] )
			{
				nota += 1;
			}
		}
		return nota;
	}
	
	public float maiorNota( Prova prova )
	{
		float maiorNota = -1;
		
		if ( maiorNota < nota() )
		{
			maiorNota = nota();
		}
		return maiorNota;
	}
}
