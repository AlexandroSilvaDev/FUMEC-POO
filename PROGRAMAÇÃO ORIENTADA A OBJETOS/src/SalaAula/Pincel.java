package SalaAula;

import javax.swing.JOptionPane;

public class Pincel {
	
	String cor;
	String tamanho;
	String formato;
	
	public Pincel ( String cor, String tamanho, String formato ) {
		
		this.cor = cor;
		this.tamanho = tamanho;
		this.formato = formato;
	}
	
	public void escrever( String texto ) {
		
		texto = "  " + cor + "  " + tamanho + "  " + formato;
		JOptionPane.showMessageDialog(null, texto);
	}
	
	public void caracteristicas(  ) {
		
		//System.out.println("  " + cor + "  " + tamanho + "  " + formato);
	}
}

