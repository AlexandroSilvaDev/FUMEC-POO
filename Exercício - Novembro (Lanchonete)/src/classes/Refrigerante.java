package classes;

public class Refrigerante extends Itens {
	
	private static int cont = 0;
	
	public Refrigerante( int quantidade, String nomeCliente ) 
	{	
		super(3, quantidade, 03, 02, 2023,
			  nomeCliente, "Refrigerante", ++cont);
	}
}
