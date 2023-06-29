package classes;

import Interface.Animal;
import Interface.Ferramentas;

public class Alicate implements Ferramentas {

	@Override
	public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] classificaEspecies(Animal[] completo) {
		// TODO Auto-generated method stub
		return null;
	}
/*
	@Override
	public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar) 
	{
		String animaisPorEspecie[];
		int cont = 0;
		
		for ( Animal[] animal : completo )
		{
			if ( animal instanceof especieFiltrar )
			{
				System.out.println("Animal: " + animal);
				System.out.println("Espécie: " + especieFiltrar);
				
				animaisPorEspecie[cont] = animal;
				
				cont++;
			}
		}
		return new animaisPorEspecie[cont];
	}

	@Override
	public String[] classificaEspecies(Animal[] completo) 
	{
		String nomeEspecies[];
		int cont = 0;
		
		for ( Animal[] animal : completo )
		{
			
		}
		
		return null;	
	}
	
	*/
}
