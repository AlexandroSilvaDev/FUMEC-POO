package questao_1;

public class JogoDaVelha {

	private Tabuleiro tabuleiro;
	private Jogador jogador1;
	private Jogador jogador2;
	private int jogadorDaVez = 0;
	
	public JogoDaVelha( Jogador jogador1, Jogador jogador2 ) 
	{
		tabuleiro = new Tabuleiro(3, 3);
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
	}
	
	public void iniciarJogo()
	{
		tabuleiro.limpar();
		jogadorDaVez = 0;
	}
	
	public boolean Ganhador()
	{
		char[][] estadoTabuleiro = tabuleiro.getTabuleiro();
		
		return verificarLinha( estadoTabuleiro ) ||
			   verificarColuna( estadoTabuleiro ) ||
			   verificarDiagonal( estadoTabuleiro );
	}
	
	private boolean verificarLinha( char[][] estadoTabuleiro )
	{
		char simbolo = getSimbolo();
		int auxiliar = 0;
		
		for ( int i = 0 ; i < 3 ; i++ )
		{
			for ( int j = 0 ; j < 3 ; j++ )
			{
				if ( estadoTabuleiro[i][j] == simbolo )
				{
					auxiliar++;
				}
				else {
					break;
				}
			}
			if ( auxiliar == 3 )
			{
				return true;
			}
			auxiliar = 0;
		}
		return false;
	}
	
	private boolean verificarColuna( char[][] estadoTabuleiro )
	{
		char simbolo = getSimbolo();
		int auxiliar = 0;
		
		for ( int i = 0 ; i < 3 ; i++ )
		{
			for ( int j = 0 ; j < 3 ; j++ )
			{
				if ( estadoTabuleiro[j][i] == simbolo )
				{
					auxiliar++;
				}
				else {
					break;
				}
			}
			if ( auxiliar == 3 )
			{
				return true;
			}
			auxiliar = 0;
		}
		return false;
	}
	
	public boolean verificarDiagonal( char[][] estadoTabuleiro )
	{
		char simbolo = getSimbolo();
		int auxiliar = 0;
		
		for ( int i = 0 ; i < 3 ; i++ )
		{
			for ( int j = 0 ; j < 3 ; j++ )
			{
				if ( estadoTabuleiro[i][j] == simbolo && i == j )
				{
					auxiliar++;
				}
				else {
					break;
				}
			}
			if ( auxiliar == 3 )
			{
				return true;
			}
			auxiliar = 0;
		}
		return false;
	}
	
	public void alterarJogador()
	{
		if ( jogadorDaVez == 0 )
		{
			jogadorDaVez = 1;
		}
		else {
			jogadorDaVez = 0;
		}
	}
	
	public void jogada( int linha, int coluna )
	{
		if ( getSimbolo() == 'X' || getSimbolo() == 'O' )
		{
			tabuleiro.inserirSimbolo(linha, coluna, getSimbolo());
		}
		else {
			System.out.println("\nPosição já preenchida!");
		}
	}
	
	public char getSimbolo()
	{
		return jogadorDaVez == 0 ? 'X' : 'O';
	}
	
	@Override
	public String toString()
	{
		return tabuleiro.toString();
	}
	
}
