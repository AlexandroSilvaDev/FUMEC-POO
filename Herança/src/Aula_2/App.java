package Aula_2;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Cachorro cachorro = new Cachorro();
		Felino felino = new Felino();
		Gato gato = new Gato();
		Tigre tigre = new Tigre();
		
		/*animal.comunica();
		cachorro.comunica();
		felino.comunica();
		gato.comunica();
		tigre.comunica();*/
		
		ArrayList<Animal> lista = new ArrayList<Animal>();
		lista.add(animal);
		lista.add(cachorro);
		lista.add(felino);
		lista.add(gato);
		lista.add(tigre);
		
		for ( Animal animalTeste : lista )
		{
			//animalTeste.comunica();
			
			if ( animalTeste instanceof Cachorro )
			{
				((Cachorro) animalTeste).busca();
			}
			
			if ( animalTeste instanceof Felino )
			{
				((Felino) animalTeste).arranha();
			}
		}
	}

}
