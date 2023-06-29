package classes;

public class Pizza extends Itens {

	private static int cont = 0;
	
	public Pizza( int quantidade, String nomeCliente ) 
	{
		super(15, quantidade, 10, 11, 2022,
			  nomeCliente, "Pizza", ++cont);
	}
}
