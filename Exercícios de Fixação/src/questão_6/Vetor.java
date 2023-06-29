package questão_6;

public class Vetor {

	private String vet[];
	private int posicao;
	
	public Vetor( int tamanhoInicial )
	{
		vet = new String[tamanhoInicial];
		posicao = 0;
	}
	
	public void insert( String string )
	{
		vet[posicao] = string;
		posicao++;
		
		if ( posicao == vet.length )
		{
			redimensionar();
		}
	}
	
	private void redimensionar()
	{
		String array[] = new String[posicao*2];
		copiar(vet, array);
		vet = array;
	}
	
	private void copiar( String origem[], String destino[] )
	{
		for ( int i = 0 ; i < origem.length ; i++ )
		{
			destino[i] = origem[i];
		}
	}
	
	@Override
	public String toString()
	{
		String conteudo = "";
		
		for ( int i = 0 ; i < posicao ; i++ )
		{
			conteudo += vet[i] + " ";
		}
		return conteudo;
	}
	
	public String get( int posicao )
	{
		return vet[posicao];
	}
	
	public int size()
	{
		return posicao;
	}
}
