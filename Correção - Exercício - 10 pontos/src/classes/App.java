package classes;

public class App {
	public static void main(String [] args) {
		Agenda agenda = new Agenda();
		
		Pessoa p1 = new Pessoa("Rodrigo", new Data(25,2,1986), 1.74);
		Pessoa p2 = new Pessoa("Jose", new Data(25,3,1986), 1.75);
		
		agenda.armazenaPessoa(p1);
		agenda.armazenaPessoa(p2);
		
		agenda.removePessoa("Rodrigo");
		System.out.println(agenda.imprimeAgenda());
		
		int posicao = agenda.buscarPessoa("Rodrigo");
		
		if(posicao != -1)
			agenda.imprimirPessoa(posicao);
	}
}
