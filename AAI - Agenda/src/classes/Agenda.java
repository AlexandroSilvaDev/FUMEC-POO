package classes;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

import interfaces.InterfaceAgenda;

/*
	Classe que implementa a interface chamada InterfaceAgenda.
	Esta classe eh obrigada a implementar os metodos da interface 
	que ela implementa, pois ela nao eh abstrata.
*/
public class Agenda implements InterfaceAgenda {

	// Array para armazenar objetos da classe Pessoa.
	
	private ArrayList<Pessoa> pessoas;
	
	// Construtor para inicializar o Array na memoria.
	
	public Agenda()
	{
		pessoas = new ArrayList<Pessoa>();
	}

	// Metodo para armazenar um objeto da classe Pessoa no Array.
	
	@Override
	public void armazenaPessoa( Pessoa p )
	{
		pessoas.add(p);
	}
	/* 
		Metodo para remover objeto(s) fazendo uma pesquisa no Array
		que armazena objetos da classe Pessoa, utilizando o nome passado 
		como parametro para comparar com o nome de cada pessoa armazenada 
		no ArrayList.
	*/
	@Override
	public void removePessoa( String nome )
	{
		ArrayList<Pessoa> toRemove = new ArrayList<Pessoa>();
		
		for ( Pessoa pessoa : pessoas )
		{
			if ( pessoa.getNome().equalsIgnoreCase(nome) )
			{
				toRemove.add(pessoa);
			}
		}
		pessoas.removeAll(toRemove);
	}
	/*
		Metodo para buscar um objeto da classe Pessoa dentro do Array
		pessoas, utilizando o nome passado como parametro para comparar 
		com o nome de cada pessoa armazenada no ArrayList. O retorno eh 
		um inteiro que identifica o index no Array onde esta guardada a 
		pessoa que esta sendo buscada pelo metodo.
	*/
	@Override
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
	/*
		Metodo para imprimir as informacoes de cada objeto do tipo pessoa
		armazenado no ArrayList. Ele retorna uma String contendo todo o 
		conteudo que precisar ser impresso no main.
	*/
	@Override
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
	/*
		Metodo que recebe como parametro um index e exibe as informacoes
		do objeto da classe Pessoa armazenado no ArrayList na posicao do
		parametro (index) recebido.
	*/
	@Override
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
