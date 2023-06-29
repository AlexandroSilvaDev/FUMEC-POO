package provaRaian;

public class CorrentistaDespesa extends Correntista {

	// despesasPrevistas é um atributo do tipo DespesasIndividuo
	
	private DespesasIndividuo despesasPrevistas;  
	
	// Método contrutor
	
	public CorrentistaDespesa( String cpfCliente, double saldo, DespesasIndividuo despesas ) 
	{
		// O super referencia o método construtor da classe Correntista
		
		super( cpfCliente, saldo );
		this.despesasPrevistas = despesas ;
	}
	
	// Método get do tipo DespesasIndividuo que retorna as despesasPrevistas
	
	public DespesasIndividuo getDespesasPrevistas() 
	{
		return despesasPrevistas;
	}
}
