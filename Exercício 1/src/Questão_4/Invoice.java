package Quest�o_4;

public class Invoice {

	private int numeroItem; // numero do item
	private String descricaoItem; // descri��o do item
	private int quantidadeComprada; // quantidade do item comprada
	private float precoItem; // pre�o do item
	
	// M�todo construtor
	
	public Invoice( int numeroItem, String descricaoItem, int quantidadeComprada, float precoItem )
	{
		// Se a quantidade inicializada for menor que 0, ele ir� dar um set no valor = 0
		
		if ( quantidadeComprada < 0 )
		{
			this.quantidadeComprada = 0;
		}
		
		// Sen�o, ele inicializa com o valor inserido de par�metro
		
		else {
			this.quantidadeComprada = quantidadeComprada;
		}
		
		// Se o pre�o do item for menor ou igual a 0, ele ir� dar um set no pre�o = 0.0
		
		if ( precoItem <= 0 )
		{
			this.precoItem = (float) 0.0;
		}
		
		// Sen�o, ele inicializa com o pre�o inserido de par�metro
		
		else {
			this.precoItem = precoItem;
		}
		
		this.numeroItem = numeroItem;
		this.descricaoItem = descricaoItem;
	}
	
	// M�todos get referentes a todos os atributos da classe, para serem acessados de outras classes
	
	public int getNumeroItem()
	{
		return numeroItem;
	}
	
	public String getDescricaoItem()
	{
		return descricaoItem;
	}
	
	public int getQuantidadeComprada()
	{
		return quantidadeComprada;
	}
	
	public float getPrecoItem()
	{
		return precoItem;
	}
	
	public double getInvoiceAmount()
	{
		return precoItem * quantidadeComprada;
	}
	
	
}
