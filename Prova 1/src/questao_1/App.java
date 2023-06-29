package questao_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Jogador j1 = new Jogador();
		Jogador j2 = new Jogador();
		Scanner leia = new Scanner(System.in);
		int linha,
			coluna;
		
		JogoDaVelha jogo = new JogoDaVelha(j1, j2);
		jogo.iniciarJogo();
		
		for ( int i = 0 ; i < 9 ; i++ )
		{
			System.out.println("Digite a linha: ");
			linha = leia.nextInt();
			
			System.out.println("\nDigite a coluna: ");
			coluna = leia.nextInt();
			
			jogo.jogada(linha, coluna);
			
			System.out.println(jogo);
			
			if ( jogo.Ganhador() )
			{
				System.out.println("\nFinal de Jogo!");
				break;
			}
			jogo.alterarJogador();
		}
		
		if ( ! jogo.Ganhador() )
		{
			System.out.println("\nDeu velha!");
		}
		
	}

}
