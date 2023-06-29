package classes;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Pessoa> contatos;
	
	public Agenda() 
	{
		contatos = new ArrayList<Pessoa>();
	}
	
	public void armazenaPessoa(Pessoa pessoa) 
	{
		contatos.add(pessoa);
	}
	
	/*
		Quando houve a tentativa de modificar o Array em que estamos iterando,
		ele apresenta o erro de exceção "ConcurrentModificationException". Este erro
	 	aponta que enquanto estamos percorrendo um Array (percorrendo suas posições)
		não podemos fazer nenhuma modificação simultânea.
	 */
	
	public void removePessoa(String nome) 
	{	
		ArrayList<Pessoa> toRemove = new ArrayList<Pessoa>();
		
		for(Pessoa p : contatos) 
		{
			if(p.getNome().equals(nome)) 
			{
				toRemove.add(p);
			}
		}
		contatos.removeAll(toRemove);
	}
	
	public int buscarPessoa(String nome) 
	{	
		for(int i = 0; i < contatos.size(); i++) 
		{
			if(contatos.get(i).getNome().equals(nome)) 
			{
				return i;
			}
		}
		return -1;
	}	
	
	public void imprimirPessoa(int index) 
	{
		System.out.println(contatos.get(index));
	}
	
	public String imprimeAgenda() 
	{
		String conteudo = "";
		
		for(Pessoa p : contatos) 
		{
			conteudo += p + "\n";
		}
		return conteudo;
	}
}
