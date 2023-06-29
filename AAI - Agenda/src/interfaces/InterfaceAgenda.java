package interfaces;

import classes.Pessoa;

public interface InterfaceAgenda {
	
	// Interface para impor comportamentos para a classe que implementa essa interface.
	
	public void armazenaPessoa( Pessoa p );
	public void removePessoa( String nome );
	public int buscaPessoa( String nome );
	public String imprimeAgenda();
	public void imprimePessoa( int index );
}
