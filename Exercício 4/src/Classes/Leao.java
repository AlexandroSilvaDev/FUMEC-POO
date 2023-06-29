package classes;

import Interface.Ferramentas;

public class Leao extends Animal implements Interface.Ferramentas {

	private float tamanho;
	
	public Leao( String nomeEspecie, String nomeAnimal, float tamanho ) 
	{
		super(nomeEspecie, nomeAnimal);
		this.tamanho = tamanho;
	}

	@Override
	public Interface.Animal[] filtraEspecie(Interface.Animal[] completo,
			String especieFiltrar) 
	{
		return null;
	}

	@Override
	public String[] classificaEspecies(Interface.Animal[] completo) 
	{
		return null;
	}


	
}
