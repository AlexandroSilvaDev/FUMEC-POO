package Quest�o_3_App;

import java.util.ArrayList;

import Quest�o_2.DespesaDia;
import Quest�o_2.DespesaMes;
import Quest�o_3.CorrentistaDespesa;
import Quest�o_3.DespesasIndividuo;

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
		
		// Gastos diarios com almo�o no mes de fevereiro
		
		DespesaDia d1 = new DespesaDia(1, 2, 50);
		DespesaDia d2 = new DespesaDia(2, 2, 70);
		DespesaDia d3 = new DespesaDia(3, 2, 100);
		
		// Gastos mensais com energia eletrica no mes de mar�o a abril
		
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
			Criando um objeto do tipo DespesasIndividuo (objeto inst�ncia da classe DespesasIndividuo)
			e passando como par�metro para o m�todo construtor da classe DespesasIndividuo a lista com
			todos os gastos
		*/
		
		DespesasIndividuo despesaIndividuo = new DespesasIndividuo(todosOsGastos);
		
		/* 
			Criando 3 objetos do tipo CorrentistaDespesa (objeto inst�ncia da classe CorrentistaDespesa) 
			e inicializando o m�todo contrutor da classe CorrentistaDespesa para cada objeto com os par�metros
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
			Criando uma lista para agrupar somente os correntistas que obt�m saldo igual ou maior 
			a sua despesa no m�s passado como par�mentro no m�todo filtro
		*/
		
		ArrayList<CorrentistaDespesa> correntistasQuePagamConta = filtro(correntistas, 2);
		
		for ( CorrentistaDespesa cpf : correntistasQuePagamConta )
		{
			System.out.println(cpf.getCPF());
		}
	}
	
	/* 
		M�todo criando para receber uma lista com os correntistas e o m�s de interesse e retorna 
		uma outra lista somente com os correntistas que obt�m saldo igual ou maior a sua despesa 
		no m�s passado como par�mentro
	*/
	
	public static ArrayList<CorrentistaDespesa> filtro( ArrayList<CorrentistaDespesa> correntistas, int mes )
	{
		// Lista Criada para agrupar os correntistas que tem o saldo suficiente para pagar sua despesa
		
		ArrayList<CorrentistaDespesa> resposta = new ArrayList<CorrentistaDespesa>();
		
		/* 
			Repeti��o criada para caminhar dentro da lista correntista e em cada posi��o o "c" 
			que � do tipo CorrentistaDespesa, assume o valor na posi��o da lista correntista
		 */
		
		for ( CorrentistaDespesa correntista : correntistas )
		{
			/*
			DespesasIndividuo di = c.getDespesasPrevistas();
			DespesaMes dm = di.totalizaMes(mes);
			double despesa = dm.getValor();
			*/
			
			/*
				Criando uma vari�vel double para receber o valor da despesa do funcion�rio analisado
				em cada posi��o da lista. "c" � do tipo CorrentistaDespesa, portanto podemos acessar
				o m�todo getDespesasPrevistas() que � do tipo DespesasIndividuo, que por sua vez d� 
				acesso ao m�todo totalizaMes(mes) onde o retorno � um objeto do tipo DespesaMes, o que
				possibilita a utiliza��o do m�todo getValor() que � respons�vel por conter o valor da
				despesa mensal de um individuo, que � o interesse neste momento para realizarmos os
				c�lculos a seguir
			 */
			
			double despesa = correntista.getDespesasPrevistas().totalizaMes(mes).getValor();
			
			/* 
				Estrutura condicional para selecionar apenas os correntistas que podem pagar a sua
				despesa no m�s passado como par�metro
			 */
			
			if ( correntista.getSaldo() >= despesa )
			{
				// Adiciona o correntista que atende a condi��o imposta no if na lista resposta
				
				resposta.add(correntista);
			}
		}
		// Retorna a lista com os correntistas que podem pagar sua despesa no m�s passado como par�metro
		
		return resposta;
	}
}
