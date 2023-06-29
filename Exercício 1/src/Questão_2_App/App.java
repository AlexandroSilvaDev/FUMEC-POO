package Quest�o_2_App;

import java.util.ArrayList;

import Quest�o_2.DespesaDia;
import Quest�o_2.DespesaIndividual;
import Quest�o_2.DespesaMes;

public class App {

	public static void main(String[] args) {
		
		// Gastos diarios com almo�o no mes de fevereiro
		
		DespesaDia d1 = new DespesaDia(1, 2, 50);
		DespesaDia d2 = new DespesaDia(2, 2, 70);
		DespesaDia d3 = new DespesaDia(3, 2, 100);
		
		// Gastos mensais com energia eletrica no mes de mar�o a abril
		
		DespesaMes d4 = new DespesaMes(3, 150);
		DespesaMes d5 = new DespesaMes(4, 1150);
		
		// Inserindo todos os meus gastos em um mesmo lugar
		
		ArrayList<DespesaMes> todosOsGastos = new ArrayList<DespesaMes>();
		
		todosOsGastos.add(d1);
		todosOsGastos.add(d2);
		todosOsGastos.add(d3);
		todosOsGastos.add(d4);
		todosOsGastos.add(d5);
		
		// Criando um objeto que representa meus gastos
		
		DespesaIndividual despesa = new DespesaIndividual("015446516-51", todosOsGastos);
		
		// Cria um objeto despesaMes do tipo DespesaMes e inicializa com os gastos do m�s de janeiro
		
		DespesaMes despesaMes = despesa.totalizaMes(1);
		
		// Mostra o valor da despesa do m�s passado como par�metro
	
		System.out.println(despesaMes.getValor());
	}

}
