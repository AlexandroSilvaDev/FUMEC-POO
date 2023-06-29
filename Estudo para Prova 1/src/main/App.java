package main;

import classes.Fila;
import classes.Pessoa;

public class App {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Alexandro", "11111111111");
		Pessoa p2 = new Pessoa("Lucas", "33333333333");
		Pessoa p3 = new Pessoa("Rodrigo", "22222222222");
		
		Fila fila = new Fila();
		
		fila.push(p1);
		fila.push(p2);
		fila.push(p3);
		
		try {
			for ( int i = 0 ; i <= 3 ; i++ )
			{
				System.out.println(fila);
				
				Pessoa atender = fila.pop();
				
				System.out.println(atender.getNome() + " foi atendido!");
				System.out.println("\n--------------------------------\n");
			}
		}
		catch ( IndexOutOfBoundsException e1 )
		{
			System.out.println("Fila vazia!");
		}
		catch ( NullPointerException e2 )
		{
			System.out.println("Essa solução não é legal, mas funciona.");
		}
		
	}

}
