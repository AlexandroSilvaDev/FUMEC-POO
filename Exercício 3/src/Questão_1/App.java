package Questão_1;

import java.util.ArrayList;
import Interface.FormaGeometrica;

public class App {

	public static void main(String[] args) {
		
		Quadrados q1 = new Quadrados(2);
		Quadrados q2 = new Quadrados(4);
		Quadrados q3 = new Quadrados(8);
		
		Retangulos r1 = new Retangulos(2, 4);
		Retangulos r2 = new Retangulos(4, 5);
		Retangulos r3 = new Retangulos(4, 4);
		
		Circulo c1 = new Circulo(2);
		Circulo c2 = new Circulo(5);
		Circulo c3 = new Circulo(10);
		
		ArrayList<FormaGeometrica> lista = new ArrayList<FormaGeometrica>();
		lista.add(q1);
		lista.add(q2);
		lista.add(q3);
		lista.add(r1);
		lista.add(r2);
		lista.add(r3);
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		
		for ( FormaGeometrica forma : lista )
		{
			System.out.println("A área: " + forma.area());
			System.out.println("O perímetro: " + forma.perimetro());
			System.out.println("---------------------------------");
			
			if ( forma instanceof Quadrados )
			{
				double lado = ((Quadrados) forma).getLado();
				
				System.out.println("Lado: " + lado);
			}
			else 
			{
				if ( forma instanceof Retangulos )
				{
					double base = ((Retangulos) forma).getBase();
					double altura = ((Retangulos) forma).getAltura();
					
					System.out.println("Base: " + base);
					System.out.println("Altura: " + altura);
				}
				else 
				{
					double raio = ( (Circulo) forma ).getRaio();
					
					System.out.println("Raio: " + raio);
				}
			}
		}
	}

}
