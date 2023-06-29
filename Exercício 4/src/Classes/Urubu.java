package classes;

public class Urubu extends Animal {

	private String cidade;
	
	public Urubu(String nomeEspecie, String nomeAnimal, String cidade ) 
	{
		super(nomeEspecie, nomeAnimal);
		this.cidade = cidade;
	}

	public void teste()
	{
		System.out.println("Teste");
	}
}
