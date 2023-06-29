package Quest�o_2;

public class DespesaDia extends DespesaMes
{
	private int dia ; // dia da despesa
	
	// M�todo construtor
	
	public DespesaDia ( int dia , int mes , float valor ) 
	{
		super ( mes , valor ) ;
		this . dia = dia ;
	}
	
	// get retorna o dia da despesa onde for executado
	
	public int getDia () 
	{
		return dia ;
	}
}
