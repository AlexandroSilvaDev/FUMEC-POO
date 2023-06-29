package Cozinha;

import javax.swing.JOptionPane;

public class Prato {
	
	String cor;
	String tamanho;
	String formato;
	
	public Prato ( String cor, String tamanho, String formato ) {
		
		this.cor = cor;
		this.tamanho = tamanho;
		this.formato = formato;
	}
	
	public void comer( String texto ) {
		
			texto = "  " + cor + "  " + tamanho + "  " + formato;
			JOptionPane.showMessageDialog(null, texto);
	}
	
	
	public void caracteristicas() {
		
		System.out.println("  " + cor + "  " + tamanho + "  " + formato);
	}
}
