package Questão_1_App;

import java.util.ArrayList;

import Questão_1.Caminhao;
import Questão_1.CarroPasseio;
import Questão_1.Motor;
import Questão_1.Veiculo;

public class App {

	public static void main(String[] args) {
		
		Motor m1 = new Motor(3, 90);
		Motor m2 = new Motor(4, 110);
		Motor m3 = new Motor(6, 250);
		Motor m4 = new Motor(10, 500);
		Motor m5 = new Motor(12, 700);
		
		
		/*
		Veiculo v1 = new Veiculo(1000, 140, m1, 50000);
		Veiculo v2 = new Veiculo(1300, 180, m2, 75000);
		Veiculo v3 = new Veiculo(1700, 230, m3, 120000);
		*/
		
		CarroPasseio c1 = new CarroPasseio("Branco", "Gol", 1000, 140, m1, 50000);
		CarroPasseio c2 = new CarroPasseio("Cinza", "Argo", 1300, 180, m2, 75000);
		CarroPasseio c3 = new CarroPasseio("Preto", "BMW", 1700, 230, m3, 120000);
		
		ArrayList<CarroPasseio> carros = new ArrayList<CarroPasseio>();
		carros.add(c1);
		carros.add(c2);
		carros.add(c3);
		
		Caminhao g1 = new Caminhao(10, 3, 10, 6000, 120, m4, 150000);
		Caminhao g2 = new Caminhao(30, 7, 30, 14000, 150, m5, 300000);
		
		ArrayList<Caminhao> carretas = new ArrayList<Caminhao>();
		carretas.add(g1);
		carretas.add(g2);
		
		System.out.println(carros);
		System.out.println(carretas);
	}

}
