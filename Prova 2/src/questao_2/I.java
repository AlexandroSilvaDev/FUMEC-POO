package questao_2;

public interface I {

	public String metodo();
	
	public default String metodo2() 
	{
		return "Ola Mundo ";
	}
}
