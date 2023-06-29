package classes;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class Agenda  {

	private ArrayList<Pessoa> pessoas;
	
	public Agenda()
	{
		pessoas = new ArrayList<Pessoa>();
	}
	
	public void armazenaPessoa( Pessoa p )
	{
		pessoas.add(p);
	}
	
	public void removePessoa( String nome )
	{
		try {
			for ( Pessoa pessoa : pessoas )
			{
				if ( pessoa.getNome().equalsIgnoreCase(nome) )
				{
					pessoas.remove(pessoa);
					break;
				}
			}
		}
		catch ( ConcurrentModificationException e )
		{
			System.out.println("\nOcorreu um erro ao remover essa pessoa da agenda.");
		}
		
		
	}
	
	public int buscaPessoa( String nome )
	{
		int posicao = 0;
		
		for ( Pessoa pessoa : pessoas )
		{
			if ( pessoa.getNome().equalsIgnoreCase(nome) )
			{
				break;
			}
			posicao++;
		}
		return posicao;
	}
	
	public String imprimeAgenda()
	{
		String dados = "";
		
		for ( Pessoa pessoa : pessoas )
		{
			dados += "\nNome: " + pessoa.getNome() +
					 "\nAltura: " + pessoa.getAltura() +
					 "\nData de nascimento: " + pessoa.getDia() +
					 "/" + pessoa.getMes() + "/" + pessoa.getAno()
					 + "\n";
		}
		return dados;
	}
	
	public void imprimePessoa( int index )
	{
		int posicao = 0;
		
		for ( Pessoa pessoa : pessoas )
		{
			if ( posicao == index )
			{
				System.out.println(pessoa);
				break;
			}
			posicao++;
		}
	}
}
