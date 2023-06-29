package Pacote1;

public class Pessoa {

	private String nome;
	private String CPF;
	
	public Pessoa() {
		
	}
	
	public Pessoa( String CPF )
	{
		this.CPF = CPF;
	}
	
	public Pessoa(String nome, String CPF) 
	{
		this.nome = nome;
		this.CPF = CPF;
	}
	
	@Override
	public String toString() {
		return nome + "  " + CPF;
	}
	
	public String xpto(int x)
	{
		return x + "Int";
	}
	
	public String xpto( String x )
	{
		return x + "String";
	}
	
}
