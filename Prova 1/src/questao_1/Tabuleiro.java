package questao_1;

public class Tabuleiro {

	private char tabuleiro[][];
	
	public Tabuleiro( int linhas, int colunas ) 
	{
		this.tabuleiro = new char[linhas][colunas];
		limpar();
	}
	
	public void inserirSimbolo( int linha, int coluna, char simbolo )
	throws ArrayIndexOutOfBoundsException
	{
		this.tabuleiro[linha][coluna] = simbolo;
	}
	
	@Override
	public String toString()
	{
		String imagem = "";
		
		for ( int i = 0 ; i < tabuleiro.length ; i++ )
		{
			for ( int j = 0 ; j < tabuleiro[0].length ; j++ )
			{
				imagem += "| " + tabuleiro[i][j] + " |";
			}
			imagem += "\n";
		}
		System.out.println("\n");
		return imagem;
	}
	
	public void limpar()
	{
		for ( int i = 0 ; i < tabuleiro.length ; i++ )
		{
			for ( int j = 0 ; j < tabuleiro[0].length ; j++ )
			{
				tabuleiro[i][j] = ' ';
			}
		}
	}
	
	public char[][] getTabuleiro()
	{
		return tabuleiro;
	}

}
