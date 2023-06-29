package classes;

public class Salgadinho extends Itens {

	private static int cont = 0;
	
	public Salgadinho( int quantidade, String nomeCliente ) 
	{
		super(6, quantidade, 30, 11, 2022,
			  nomeCliente, "Salgadinho", ++cont);
	}
}
