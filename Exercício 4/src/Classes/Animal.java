package classes;

public abstract class Animal implements Interface.Animal {

	private String nomeEspecie;
	private String nomeAnimal;
	
	public Animal( String nomeEspecie, String nomeAnimal ) 
	{
		super();
		this.nomeEspecie = nomeEspecie;
		this.nomeAnimal = nomeAnimal;
	}
	
	public String getNomeEspecie()
	{
		return nomeEspecie;
	}
	
	public String getNomeAnimal()
	{
		return nomeAnimal;
	}
}
