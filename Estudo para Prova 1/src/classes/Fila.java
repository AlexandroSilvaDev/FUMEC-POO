package classes;

import java.util.ArrayList;

public class Fila {

	private ArrayList<Pessoa> lista;
	
	public Fila()
	{
		lista = new ArrayList<Pessoa>();
	}
	
	public Fila( ArrayList<Pessoa> pessoas )
	{
		lista = pessoas;
	}
	
	public void push( Pessoa p )
	{
		lista.add(p);
	}
	
	public Pessoa pop() throws ArrayIndexOutOfBoundsException
	{
		return lista.remove(0);
	}
	
	/*
		public Pessoa pop()
		{
			if ( lista.size() > 0 )
			{
				return lista.remove(0);
			}
			
			return null;
		}
	 */
	
	@Override
	public String toString()
	{
		String saida = "";
		
		for (Pessoa p : lista)
		{
			saida += p.getNome() + "\n";
		}
		return saida;
	}
	
	public ArrayList<Pessoa> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Pessoa> lista) {
		this.lista = lista;
	}
}
