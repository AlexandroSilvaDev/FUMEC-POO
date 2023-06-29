package Questão_2;

public class Main {

	public static void main(String[] args) {
		
		int [] vetor = new int [] { 2 , 4 , 6 , 8 , 10 , 12 };
		
		try 
		{
			for (int i = 0; i <= 12; i ++) 
			{
				System . out . println ( vetor [ i ]);
			}
		}
		catch( ArrayIndexOutOfBoundsException e1 )
		{
			System.out.println("Tratado");
		}
		
		//System.out.println("Checkpoint garantindo que a estrutura de repetição foi terminada!");
		System.out.println("O vetor acabou!");
	}

}
