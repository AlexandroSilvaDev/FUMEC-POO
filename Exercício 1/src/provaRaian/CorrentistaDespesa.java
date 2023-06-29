package provaRaian;

public class CorrentistaDespesa extends Correntista {

	// despesasPrevistas � um atributo do tipo DespesasIndividuo
	
	private DespesasIndividuo despesasPrevistas;  
	
	// M�todo contrutor
	
	public CorrentistaDespesa( String cpfCliente, double saldo, DespesasIndividuo despesas ) 
	{
		// O super referencia o m�todo construtor da classe Correntista
		
		super( cpfCliente, saldo );
		this.despesasPrevistas = despesas ;
	}
	
	// M�todo get do tipo DespesasIndividuo que retorna as despesasPrevistas
	
	public DespesasIndividuo getDespesasPrevistas() 
	{
		return despesasPrevistas;
	}
}
