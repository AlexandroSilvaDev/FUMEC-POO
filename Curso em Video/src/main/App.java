package main;

import classes.Caneta;

public class App {

	public static void main(String[] args) {
		/*
		Caneta c1 = new Caneta("BIC", "Azul", 1.5f, 90, true);
		Caneta c2 = new Caneta("ABC", "Preta", 3, 70, false);
		
		c1.status();
		c1.rabiscar();
		
		c2.status();
		c2.rabiscar();
		*/
		
		Caneta c1 = new Caneta();
		
		c1.modelo = "BIC cristal";
		c1.cor = "Azul";
		c1.tampar();
		c1.status();
		c1.rabiscar();
	}

}
