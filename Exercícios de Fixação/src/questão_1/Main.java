package questão_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String texto;
		Braille b1;
		
		System.out.println("Digite uma String: ");
		texto = leia.nextLine();
		
		b1 = new Braille(texto);
		b1.converterString();
	}

}
