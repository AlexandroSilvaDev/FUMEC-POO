package provaRaian;

public class Correntista {

	private String CPF; // CPF do Correntista
	private double saldo; // Saldo do Correntista
	public static int xpto = 3;
	
	// M�todo construtor
	
	public Correntista() {
		
	}
	
	public Correntista ( String CPF , double saldo ) 
	{
		this . CPF = CPF;
		this . saldo = saldo;
	}
	
	// Get saldo � utilizando para acessar o valor de saldo de fora desta classe
	
	public double getSaldo () 
	{
		return saldo;
	}
	
	// Get CPF � utilizando para acessar o CPF de fora desta classe
	
	public String getCPF () 
	{
		return CPF;
	}
}
