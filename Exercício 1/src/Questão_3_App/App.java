package Questão_3_App;

import java.util.ArrayList;

import Questão_2.DespesaDia;
import Questão_2.DespesaMes;
import Questão_3.CorrentistaDespesa;
import Questão_3.DespesasIndividuo;

public class App {

	public static void main(String[] args) {
		
		/*
		Correntista.xpto = 5;
		Correntista a1 = new Correntista();
		Correntista a2 = new Correntista();
		
		a1.xpto = 10;
		
		System.out.println(a1.xpto);
		System.out.println(a2.xpto);
		*/
		
		// Gastos diarios com almoço no mes de fevereiro
		
		DespesaDia d1 = new DespesaDia(1, 2, 50);
		DespesaDia d2 = new DespesaDia(2, 2, 70);
		DespesaDia d3 = new DespesaDia(3, 2, 100);
		
		// Gastos mensais com energia eletrica no mes de março a abril
		
		DespesaMes d4 = new DespesaMes(3, 150);
		DespesaMes d5 = new DespesaMes(4, 1150);
		
		// Criando uma lista para agrupar todos os gastos
		
		ArrayList<DespesaMes> todosOsGastos = new ArrayList<DespesaMes>();
		
		// Inserindo todos os meus gastos em um mesmo lugar (Lista)
		
		todosOsGastos.add(d1);
		todosOsGastos.add(d2);
		todosOsGastos.add(d3);
		todosOsGastos.add(d4);
		todosOsGastos.add(d5);
		
		/* 
			Criando um objeto do tipo DespesasIndividuo (objeto instância da classe DespesasIndividuo)
			e passando como parâmetro para o método construtor da classe DespesasIndividuo a lista com
			todos os gastos
		*/
		
		DespesasIndividuo despesaIndividuo = new DespesasIndividuo(todosOsGastos);
		
		/* 
			Criando 3 objetos do tipo CorrentistaDespesa (objeto instância da classe CorrentistaDespesa) 
			e inicializando o método contrutor da classe CorrentistaDespesa para cada objeto com os parâmetros
			inseridos abaixo
		*/
		
		CorrentistaDespesa c1 = new CorrentistaDespesa("12350248658", 100000, despesaIndividuo);
		CorrentistaDespesa c2 = new CorrentistaDespesa("99999999999", 0, despesaIndividuo);
		CorrentistaDespesa c3 = new CorrentistaDespesa("55555555555", 100, despesaIndividuo);
		
		// Criando uma Lista para agrupar todos os correntistas criados anteriormente 
		
		ArrayList<CorrentistaDespesa> correntistas = new ArrayList<CorrentistaDespesa>();
		
		// Inserindo os 3 correntistas na lista chamada correntistas
		
		correntistas.add(c1);
		correntistas.add(c2);
		correntistas.add(c3);
		
		/* 
			Criando uma lista para agrupar somente os correntistas que obtém saldo igual ou maior 
			a sua despesa no mês passado como parâmentro no método filtro
		*/
		
		ArrayList<CorrentistaDespesa> correntistasQuePagamConta = filtro(correntistas, 2);
		
		for ( CorrentistaDespesa cpf : correntistasQuePagamConta )
		{
			System.out.println(cpf.getCPF());
		}
	}
	
	/* 
		Método criando para receber uma lista com os correntistas e o mês de interesse e retorna 
		uma outra lista somente com os correntistas que obtém saldo igual ou maior a sua despesa 
		no mês passado como parâmentro
	*/
	
	public static ArrayList<CorrentistaDespesa> filtro( ArrayList<CorrentistaDespesa> correntistas, int mes )
	{
		// Lista Criada para agrupar os correntistas que tem o saldo suficiente para pagar sua despesa
		
		ArrayList<CorrentistaDespesa> resposta = new ArrayList<CorrentistaDespesa>();
		
		/* 
			Repetição criada para caminhar dentro da lista correntista e em cada posição o "c" 
			que é do tipo CorrentistaDespesa, assume o valor na posição da lista correntista
		 */
		
		for ( CorrentistaDespesa correntista : correntistas )
		{
			/*
			DespesasIndividuo di = c.getDespesasPrevistas();
			DespesaMes dm = di.totalizaMes(mes);
			double despesa = dm.getValor();
			*/
			
			/*
				Criando uma variável double para receber o valor da despesa do funcionário analisado
				em cada posição da lista. "c" é do tipo CorrentistaDespesa, portanto podemos acessar
				o método getDespesasPrevistas() que é do tipo DespesasIndividuo, que por sua vez dá 
				acesso ao método totalizaMes(mes) onde o retorno é um objeto do tipo DespesaMes, o que
				possibilita a utilização do método getValor() que é responsável por conter o valor da
				despesa mensal de um individuo, que é o interesse neste momento para realizarmos os
				cálculos a seguir
			 */
			
			double despesa = correntista.getDespesasPrevistas().totalizaMes(mes).getValor();
			
			/* 
				Estrutura condicional para selecionar apenas os correntistas que podem pagar a sua
				despesa no mês passado como parâmetro
			 */
			
			if ( correntista.getSaldo() >= despesa )
			{
				// Adiciona o correntista que atende a condição imposta no if na lista resposta
				
				resposta.add(correntista);
			}
		}
		// Retorna a lista com os correntistas que podem pagar sua despesa no mês passado como parâmetro
		
		return resposta;
	}
}
