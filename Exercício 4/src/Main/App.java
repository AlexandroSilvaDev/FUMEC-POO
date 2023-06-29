package main;

import java.util.Scanner;

import Interface.Animal;
import classes.Galo;
import classes.Leao;
import classes.Porco;
import classes.Urubu;

public class App {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Animal vetor[] = new Animal[10];
		
		try 
		{
			Leao leao = criaLeao();
			vetor[0] = leao;
			System.out.println(leao.getNomeAnimal());
			
			Galo galo = criaGalo();
			vetor[1] = galo;
			System.out.println(galo.getNomeEspecie());
			
			Urubu urubu = criaUrubu();
			urubu.teste();
			vetor[2] = urubu;
			System.out.println(urubu.getNomeEspecie());
			
			Porco porco = criaPorco();
			vetor[3] = porco;
			System.out.println("Nome: " + porco.getNomeAnimal() + 
					"Espécie: " + porco.getNomeEspecie());
		}
		catch ( NumberFormatException e )
		{
			System.out.println("\nTratado com sucesso!");
		}
		
		
	}
	
	public static Porco criaPorco()
	{
		String nomeEspecie = receba("Especie:");
		String nomeAnimal = receba("Nome:");
		double peso = Double.parseDouble( receba("Peso:") );
		
		return new Porco( nomeEspecie, nomeAnimal, peso );
	}
	
	public static Urubu criaUrubu()
	{
		String nomeEspecie = receba("Especie:");
		String nomeAnimal = receba("Nome:");
		String cidade = receba("Cidade:");
		
		return new Urubu( nomeEspecie, nomeAnimal, cidade );
	}
	
	public static Galo criaGalo()
	{
		String nomeEspecie = receba("Especie:");
		String nomeAnimal = receba("Nome:");
		String cor = receba("Cor:");
		
		return new Galo( nomeEspecie, nomeAnimal, cor );
	}
	
	public static Leao criaLeao()
	{
		String nomeEspecie = receba("Especie:");
		String nomeAnimal = receba("Nome:");
		float tamanho = Float.parseFloat( receba("Tamanho:") );
		
		return new Leao( nomeEspecie, nomeAnimal, tamanho );
	}
	
	public static String receba( String mensagem )
	{
		Scanner leia = new Scanner(System.in);
		
		System.out.println(mensagem);
		String valor = leia.nextLine();
		
		return valor;
	}
}
