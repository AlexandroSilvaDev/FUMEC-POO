package questão_7;

public interface Repositorio {

	public void guarda( Pessoa nova );
	public Pessoa recupera( String cpf );
	public Pessoa primeiro();
	public Pessoa proximo();
}
