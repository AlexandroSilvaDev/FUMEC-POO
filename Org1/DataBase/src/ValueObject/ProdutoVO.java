package ValueObject;

public class ProdutoVO {
	private int id;
	private String descricao;
	private float preco;
	private float precoPromocional;
	
	public ProdutoVO(int id, String descricao, float preco, float precoPromocional) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
		this.precoPromocional = precoPromocional;
	}
	
	public ProdutoVO(int id, String descricao, float preco) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getPrecoPromocional() {
		return precoPromocional;
	}

	public void setPrecoPromocional(float precoPromocional) {
		this.precoPromocional = precoPromocional;
	}
	
	@Override 
	public String toString() {
		return descricao;
	}

	
}
