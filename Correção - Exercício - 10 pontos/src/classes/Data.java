package classes;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	private static int[] diasMes = new int[] {31,0,31,30,31,30,31,31,30,31,30,31};
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		if(!validarData()) {
			this.dia = 1;
			this.mes = 1;
			this.ano = 1;
		}
		
	}
	
	public int comparar(Data data) {
		int resultado = compararAno(data.ano) + compararMes(data.mes) + compararDia(data.dia);
		if(resultado == 0) return 0;
		return resultado > 0 ? 1 : -1;
	}
	
	private int compararAno(int ano) {
		if(ano < this.ano) return 1000;
		if(ano == this.ano) return 0;
		return -1000;
	}
	
	private int compararMes(int mes) {
		if(mes < this.mes) return 100;
		if(mes == this.mes) return 0;
		return -100;
	}
	
	private int compararDia(int dia) {
		if(dia < this.dia) return 1;
		if(dia == this.dia) return 0;
		return -1;
	}
	
	public void setDia(int dia) {
		this.dia = validarDia(dia, this.mes, this.ano) ? dia : this.dia;
	}
	
	public void setMes(int mes) {
		this.mes = validarMes(mes) && validarDia(this.dia, mes, this.ano) ? mes : this.mes;
	}
	
	public void setAno(int ano) {
		this.ano = validarAno(ano) && validarDia(this.dia, this.mes, ano)? ano : this.ano;
	}	
	
	public boolean validarMes() {
		return mes > 0 || mes < 13;
	}
	
	public static boolean validarMes(int mes) {
		return mes > 0 || mes < 13;
	}
	
	public boolean validarAno() {
		return ano > 0;
	}
	
	public static boolean validarAno(int ano) {
		return ano > 0;
	}
	
	public boolean validarData() {
		
		return validarAno() && validarMes() && validarDia();
		
	}
	
	public static boolean validarDia(int dia, int mes, int ano) {
		return validarDiaInterno(dia, mes, ano); 
	}
	
	public boolean validarDia() {
		return validarDiaInterno(dia, mes, ano); 	
	}
	
	private static boolean validarDiaInterno(int dia, int mes, int ano) {
		int qtdeDia;
		
		if(mes == 2) {
			qtdeDia = isBissexto(ano) ? 29 : 28;
		}else {
			qtdeDia = diasMes[mes - 1];
		}
		
		return dia > 0 && dia <= qtdeDia;		
	}
	
	public boolean isBissexto() {
		return isBissextoInterno(ano);
	}
	
	public static boolean isBissexto(int ano) {
		return isBissextoInterno(ano);
	}
	
	private static boolean isBissextoInterno(int ano) {
		if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0))
			return true;
		
		return false;
	}
	
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
	
	public int getAno() {
		return ano;
	}
	
	
}
