package Configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFUMEC {
	private final String url;		//aqui será configurada a string de conexão 
	private final String dataBasePrefix; //identifica qual tipo de banco será utilizado
	private final String hostName;  //maquina onde se encontra o bancode dados
	private final String userName;
	private final String password; 
	private final String jdbcDrive; //possibilita fazer chamadas ao SGBD
	private final String dataBase;  //container onde será armazenado as suas tabelas
	private final String port;      //porta onde foi configurado o banco de dados
	
	private Connection con;         //Esta interface contem as operacoes essencias para manipular o BD
	
	public ConnectionFUMEC(String dataBasePrefix, String hostName, String userName, String password, String jdbcDrive,
			String dataBase, String port) {		
		
		this.dataBasePrefix = dataBasePrefix;
		this.hostName = hostName;
		this.userName = userName;
		this.password = password;
		this.jdbcDrive = jdbcDrive;
		this.dataBase = dataBase;
		this.port = port;
		    //jdbc:postgresql: /localhost      :5432         /banco/
		url = dataBasePrefix + hostName + ":" + port + "/" + dataBase;
	}
	
	public String getUrlCOnnection() {
		return url;
	}
	
	public Connection open() throws SQLException{
		con = DriverManager.getConnection(url, userName, password);
		System.out.println("Conexão efetuada!");
		return con;
	}
	
	public void close() throws SQLException{
		con.close();
		System.out.println("Conexão Fechada!");
	}

}
