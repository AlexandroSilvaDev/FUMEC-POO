package main;

import classes.Lanches;
import classes.Pizza;
import classes.Refrigerante;
import classes.Salgadinho;

public class Main {

	public static void main(String[] args) {
		
		Refrigerante r1 = new Refrigerante(2, "Alexandro");
		Pizza p1 = new Pizza(1, "Alexandro");
		Lanches l1 = new Lanches(1, "Lucas");
		Salgadinho s1 = new Salgadinho(2, "Lucas");
		
		r1.pedido();
		r1.notaFiscal();
		r1.troco(20);
		
		p1.pedido();
		p1.notaFiscal();
		p1.troco(30);
		
		l1.pedido();
		l1.notaFiscal();
		l1.troco(100);
		
		s1.pedido();
		s1.notaFiscal();
		s1.troco(200);
		
	}

}
