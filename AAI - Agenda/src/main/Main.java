package main;

import classes.Agenda;
import classes.Funcionario;
import classes.Pessoa;

public class Main {

	public static void main(String[] args) {

		Funcionario p1 = new Funcionario("Alexandro", 190, 25, 03, 1997);
		Funcionario p2 = new Funcionario("Rodrigo", 170, 30, 12, 1982);
		Funcionario p3 = new Funcionario("Raian", 180, 29, 10, 2002);
		
		System.out.println("\n" + p1.getNome() + " tem " +
						   p1.calcularIdade() + " anos de idade!\n");
		
		Agenda agenda = new Agenda();
		
		agenda.armazenaPessoa(p1);
		agenda.armazenaPessoa(p2);
		agenda.armazenaPessoa(p3);
		
		agenda.buscaPessoa("Alexandro");
		agenda.buscaPessoa("Rodrigo");
		agenda.buscaPessoa("Raian");
		
		agenda.removePessoa("Raian");
		
		System.out.println(agenda.imprimeAgenda());
		
		agenda.imprimePessoa(0);
		agenda.imprimePessoa(1);
	}

}
