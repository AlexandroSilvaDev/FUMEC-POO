package classes;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	
	private static int [] diaMes = new int[] {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Data( int dia, int mes, int ano )
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		if ( ! validaData() )
		{
			this.dia = 1;
			this.mes = 1;
			this.ano = 1;
		}
	}
	
	public int compara( Data data )
	{
		int resultado = compararAno( data.ano ) + compararMes( data.mes ) + compararDia(data.dia);
		
		if ( resultado == 0 )
		{
			return 0;
		}
		if ( resultado > 0 )
		{
			return 1;
		}
		return -1;
	}

	public int compararAno( int ano )
	{
		if ( this.ano > ano )
		{
			return 1000;
		}
		if ( this.ano < ano )
		{
			return -1000;
		}
		return 0;
	}
	
	public int compararMes( int mes )
	{
		if ( this.mes > mes )
		{
			return 100;
		}
		if ( this.mes < mes )
		{
			return -100;
		}
		return 0;
	}
	
	public int compararDia( int dia )
	{
		if ( this.dia > dia )
		{
			return 1;
		}
		if ( this.dia < dia )
		{
			return -1;
		}
		return 0;
	}
	
	public void setDia( int dia )
	{	
		if ( validarDia( dia, this.mes, this.ano ) )
		{
			this.dia = dia;
		}
	}
	
	public void setMes( int mes )
	{	
		if ( validarMes(mes) && validarDia(this.dia, mes, this.ano) )
		{
			this.mes = mes;
		}
	}
	
	public void setAno( int ano )
	{
		if ( validarDia( this.dia, this.mes, ano ) && validarAno(ano) )
		{
			this.ano = ano;
		}
	}
	
	public boolean validaData()
	{
		return validarAno() && validarMes() && validarDia();
	}
	
	public boolean validarDia()
	{
		return validarDiaInterno(dia, mes, ano);
	}
	
	public static boolean validarDia( int dia, int mes, int ano )
	{
		return validarDiaInterno(dia, mes, ano);
	}
	
	private static boolean validarDiaInterno( int dia, int mes, int ano )
	{
		int quantidadeDia;
		
		if ( mes == 2 )
		{
			if ( isBissexto(ano) )
			{
				quantidadeDia = 29;
			}
			else {
				quantidadeDia = 28;
			}
		}
		else {
			quantidadeDia = diaMes[mes - 1];
		}
		return dia > 0 && quantidadeDia >= dia;
	}
	
	public boolean validarMes()
	{
		return mes > 0 && mes < 13;
	}
	
	public static boolean validarMes( int mes )
	{
		return mes > 0 && mes < 13;
	}
	
	public boolean validarAno()
	{
		return ano > 0;
	}
	
	public static boolean validarAno( int ano )
	{
		return ano > 0;
	}
	
	public boolean isBissexto()
	{
		return isBissextoInterno(ano);
	}
	
	public static boolean isBissexto( int ano )
	{
		return isBissextoInterno(ano);
	}
	
	private static boolean isBissextoInterno( int ano )
	{
		if ( ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0 )
		{
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		return dia + "/" + mes + "/" + ano;
	}
	
	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}
}
