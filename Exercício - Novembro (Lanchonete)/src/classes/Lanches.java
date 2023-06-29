package classes;

public class Lanches extends Itens {

	private static int cont = 0;
	
	public Lanches( int quantidade, String nomeCliente ) 
	{
		super(8, quantidade, 15, 11, 2022,
			  nomeCliente, "Lanches", ++cont);
	}
}
