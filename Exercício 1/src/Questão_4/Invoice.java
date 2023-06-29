package Questão_4;

public class Invoice {

	private int numeroItem; // numero do item
	private String descricaoItem; // descrição do item
	private int quantidadeComprada; // quantidade do item comprada
	private float precoItem; // preço do item
	
	// Método construtor
	
	public Invoice( int numeroItem, String descricaoItem, int quantidadeComprada, float precoItem )
	{
		// Se a quantidade inicializada for menor que 0, ele irá dar um set no valor = 0
		
		if ( quantidadeComprada < 0 )
		{
			this.quantidadeComprada = 0;
		}
		
		// Senão, ele inicializa com o valor inserido de parâmetro
		
		else {
			this.quantidadeComprada = quantidadeComprada;
		}
		
		// Se o preço do item for menor ou igual a 0, ele irá dar um set no preço = 0.0
		
		if ( precoItem <= 0 )
		{
			this.precoItem = (float) 0.0;
		}
		
		// Senão, ele inicializa com o preço inserido de parâmetro
		
		else {
			this.precoItem = precoItem;
		}
		
		this.numeroItem = numeroItem;
		this.descricaoItem = descricaoItem;
	}
	
	// Métodos get referentes a todos os atributos da classe, para serem acessados de outras classes
	
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
