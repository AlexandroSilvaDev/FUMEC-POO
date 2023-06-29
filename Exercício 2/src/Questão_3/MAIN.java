package Questão_3;

public class MAIN {

	public static void main(String[] args) {
			
	Nightingale florence = new Nightingale();
	
	/* 
		Exibirá valor de referenceCount = 1. O valor de referenceCount começou igual a 0.
		Na linha 7 ele vai executar o que está dentro do método construtor Nightingale(),
		que é um incremento de 1 no valor da variável referenceCount, tornando o valor 1.
	 */
	
	System.out.println(" Before: " + florence.getRefCount() );
	
	Nightingale florence2 = new Nightingale ();
	
	/* 
		Exibirá valor de referenceCount = 2. Aqui ele repetirá o padrão do comentário anterior,
		na linha 17 irá executar o método construtor Nightingale(), que é um incremento de 1 no
		valor da variável referenceCount, tornando o valor 2.
	 */
	
	System.out.println(" After: " + florence.getRefCount() );
	
	/*
		Se forem criados 10 objetos da classe Bird e 5 da classe Nightigale, nenhuma instância da
		variável referenceCount será criada, pois ela é uma variável declarada como static, ou seja,
		ela será a mesma para todos os objetos daquela classe. Porém, seriam criadas 10 instâncias da
		variável "a", pois cada objeto criado da classe Bird, instância uma váriavel a diferente, já que
		ela não é static.
	 */
	}
}
