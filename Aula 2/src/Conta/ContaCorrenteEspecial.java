package Conta;

// extends == heran�a de nome da classe

public class ContaCorrenteEspecial extends ContaCorrente {

	private double limite;
	
	public ContaCorrenteEspecial() {
		
	}
	
	public ContaCorrenteEspecial( double saldo, double limite ) {
		
		// super chama o metodo construtor da classe de heran�a
		
		super(saldo);
		this.limite = limite;
	}
	
	public boolean saque( double valor ) {
		
		if ( saldo + limite >= valor )
		{
			saldo -= valor;
			return true;
		}
		return false;
	}
	
}
