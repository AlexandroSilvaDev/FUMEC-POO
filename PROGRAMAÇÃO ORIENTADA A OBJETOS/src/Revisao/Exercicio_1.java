package Revisao;
import java.util.*;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		// ENTRADA
		Scanner leia = new Scanner(System.in);
		float celsius, kelvin;
		
		System.out.println("Digite uma temperatura em graus celsius: ");
		celsius = leia.nextFloat();
		
		// PROCESSAMENTO
		kelvin = celsius + 273.15f;
		
		// SAIDA
		System.out.println("Temperatura em �C: " + celsius + "\n temperatura em K: " + kelvin);
	}

}
