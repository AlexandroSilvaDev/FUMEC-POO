package questao_5;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		Quadrado q1 = new Quadrado(2);
		Quadrado q2 = new Quadrado(4);
		Quadrado q3 = new Quadrado(8);
		
		Retangulo r1 = new Retangulo(2, 4);
		Retangulo r2 = new Retangulo(4, 2);
		Retangulo r3 = new Retangulo(4, 4);
		
		Circulo c1 = new Circulo(2); 
		Circulo c2 = new Circulo(5); 
		Circulo c3 = new Circulo(10); 
		
		ArrayList<FormaGeometrica> formas = new ArrayList<FormaGeometrica>();
		
		formas.add(q1);
		formas.add(q2);
		formas.add(q3);
		formas.add(r1);
		formas.add(r2);
		formas.add(r3);
		formas.add(c1);
		formas.add(c2);
		formas.add(c3);
		
		System.out.println(formas);
	}

}
