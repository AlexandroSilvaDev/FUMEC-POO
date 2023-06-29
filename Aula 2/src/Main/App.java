package Main;

import Conta.ContaCorrente;
import Conta.ContaCorrenteEspecial;
import Transferencia.Pix;

public class App {

	public static void main(String[] args) {
		
		// Conta Corrente
		
		// objeto 1
		
		ContaCorrente conta1 = new ContaCorrente(100);
		
		// Metodo saque
		
		System.out.println(conta1.saque(90));
		System.out.println(conta1.getSaldo());
		
		// Metodo deposito
		
		System.out.println(conta1.deposito(1000));
		
		// Objeto 2
		
		ContaCorrente conta2 = new ContaCorrente(1000);
		
		// Metodo saque
		
		System.out.println(conta2.saque(90));
		System.out.println(conta2.getSaldo());
		
		// Metodo deposito
		
		System.out.println(conta2.deposito(1000));
		
		// Conta Corrente Especial
		
		ContaCorrenteEspecial c2 = new ContaCorrenteEspecial(300, 100);
		ContaCorrente c1 = new ContaCorrente(100);
		
		if ( c1.saque(200) )
		{
			System.out.println("Saque Liberado!");
		}
		else {
			System.out.println("Saque Negado!");
		}
		Pix pix = new Pix();
		
		boolean flag = pix.transferencia(c1, c2, 50);
		
		if ( flag )
		{
			System.out.println("Transferencia Realizada!");
			System.out.println("Saldo c1: " + c1.getSaldo());
			System.out.println("Saldo c2: " + c2.getSaldo());
		}
		else {
			System.out.println("Transferencia não efetuada!");
		}
	}
}
