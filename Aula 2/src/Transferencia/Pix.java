package Transferencia;

import Conta.ContaCorrente;

public class Pix {
	
	public boolean transferencia( ContaCorrente origem, ContaCorrente destino, double valor ) {
		
		if ( origem.saque(valor) )
		{
			destino.deposito(valor);
			return true;
		}
		return false;
	}
}
