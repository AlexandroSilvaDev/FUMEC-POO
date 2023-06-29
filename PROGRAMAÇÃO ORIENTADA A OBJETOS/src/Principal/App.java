package Principal;

import Cozinha.Prato;
import SalaAula.Pincel;

public class App {

	public static void main(String[] args) {
		
		Pincel pincelAzul = new Pincel("Azul", "P", "Cilindrico");
		Prato pratoMarrom = new Prato("Marrom", "G", "Fundo");
		
		pincelAzul.caracteristicas();
		pratoMarrom.caracteristicas();
		
		pincelAzul.escrever(null);
		pratoMarrom.comer(null);
	}

}
