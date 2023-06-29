package Quest�o_3;

public class MAIN {

	public static void main(String[] args) {
			
	Nightingale florence = new Nightingale();
	
	/* 
		Exibir� valor de referenceCount = 1. O valor de referenceCount come�ou igual a 0.
		Na linha 7 ele vai executar o que est� dentro do m�todo construtor Nightingale(),
		que � um incremento de 1 no valor da vari�vel referenceCount, tornando o valor 1.
	 */
	
	System.out.println(" Before: " + florence.getRefCount() );
	
	Nightingale florence2 = new Nightingale ();
	
	/* 
		Exibir� valor de referenceCount = 2. Aqui ele repetir� o padr�o do coment�rio anterior,
		na linha 17 ir� executar o m�todo construtor Nightingale(), que � um incremento de 1 no
		valor da vari�vel referenceCount, tornando o valor 2.
	 */
	
	System.out.println(" After: " + florence.getRefCount() );
	
	/*
		Se forem criados 10 objetos da classe Bird e 5 da classe Nightigale, nenhuma inst�ncia da
		vari�vel referenceCount ser� criada, pois ela � uma vari�vel declarada como static, ou seja,
		ela ser� a mesma para todos os objetos daquela classe. Por�m, seriam criadas 10 inst�ncias da
		vari�vel "a", pois cada objeto criado da classe Bird, inst�ncia uma v�riavel a diferente, j� que
		ela n�o � static.
	 */
	}
}
