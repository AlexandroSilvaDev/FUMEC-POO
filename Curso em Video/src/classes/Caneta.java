package classes;

public class Caneta {

	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	public Caneta()
	{
		
	}
	
	public Caneta( String modelo, String cor, float ponta, 
			int carga, boolean tampada )
	{
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.carga = carga;
		this.tampada = tampada;
	}
	
	public void status()
	{
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}
	
	public void rabiscar()
	{
		if ( this.tampada )
		{
			System.out.println("\nErro! Não posso rabiscar!\n");
		}
		else {
			System.out.println("\nEstou rabiscando!\n");
		}
	}
	
	public void tampar()
	{
		this.tampada = true;
	}
	
	public void destampar()
	{
		this.tampada = false;
	}
}
