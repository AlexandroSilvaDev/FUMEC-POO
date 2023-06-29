package Questão_4_App;

import Questão_4.Invoice;

public class App {

	public static void main(String[] args) {
		
		// Criação de objetos do tipo Invoice e inicializando o método construtor para cada objeto 
		
		Invoice compra1 = new Invoice(1, "CPU", 3, 500);
		Invoice compra2 = new Invoice(2, "Gabinete", 5, 200);
		Invoice compra3 = new Invoice(3, "Placa de video", 3, 2500);
		
		// Mostra a nota fiscal das 3 compras (objetos)
		
		System.out.println( compra1.getNumeroItem() + "  " + compra1.getDescricaoItem() + 
				"  " + compra1.getQuantidadeComprada() + "  " + compra1.getPrecoItem() +
				"  " + compra1.getInvoiceAmount() );
		
		System.out.println( compra2.getNumeroItem() + "  " + compra2.getDescricaoItem() + 
				"  " + compra2.getQuantidadeComprada() + "  " + compra2.getPrecoItem() +
				"  " + compra2.getInvoiceAmount() );
		
		System.out.println( compra3.getNumeroItem() + "  " + compra3.getDescricaoItem() + 
				"  " + compra3.getQuantidadeComprada() + "  " + compra3.getPrecoItem() +
				"  " + compra3.getInvoiceAmount() );
		
	}

}
