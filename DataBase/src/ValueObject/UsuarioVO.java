package ValueObject;

public class UsuarioVO {
	private int id;
	private String login;
	private String email;
	
	public UsuarioVO(int id, String login, String password, String email) {
		this.id = id;
		this.login = login;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", login=" + login + ", email=" + email + "]";
	}
}
