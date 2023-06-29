package Conta;

public class ContaCorrente {
	
	protected double saldo;
	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente( double saldo ) {
		
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		
		return saldo;
	}
	
	public boolean saque( double valor ) {
		
		boolean valida;
		
		valida = false;
		
		if ( saldo >= valor )
		{
			saldo -= valor;
			valida = true;
			return valida;
		}
		return valida; 
	}
	
	public double deposito( double valor ) {
		
		saldo += valor;
		
		return saldo;
	}
}
