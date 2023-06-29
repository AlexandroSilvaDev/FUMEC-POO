package provaRaian;

public class DespesaMes
{
	private int mes ; // mes da despesa
	private float valor ; // valor da despesa
	
	// Método construtor
	
	public DespesaMes ( int mes , float valor ) 
	{
		this . mes = mes ;
		this . valor = valor ;
	}
	
	// get que retorna o mês inicializado no atributo mes da classe pelo construtor onde ele for executado
	
	public int getMes () 
	{
		return mes ;
	}
	
	// get que retorna o valor da despesa inicializado no atributo valor da classe pelo construtor onde ele for executado
	
	public float getValor () 
	{
		return valor ;
	}
}
