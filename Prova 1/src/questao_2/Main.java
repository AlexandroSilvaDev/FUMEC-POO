package questao_2;

public class Main {

	public static void main(String[] args) {

		Ponto2D ponto1 = new Ponto2D();
		Ponto2D ponto2 = new Ponto2D(5, 3);
		Ponto2D ponto3 = new Ponto2D(ponto2);
		
		System.out.println(ponto1.comparacao(ponto3));
		
		if ( ponto2.comparacao(ponto3) )
		{
			System.out.println("\nOs pontos s�o iguais.");
		}
		else {
			System.out.println("\nOs pontos n�o s�o iguais.");
		}
		
		System.out.println("\nA dist�ncia entre os pontos �: " + 
							ponto1.calcularDistancia(ponto3) );
	}

}
