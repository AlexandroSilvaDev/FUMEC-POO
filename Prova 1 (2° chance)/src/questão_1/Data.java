package questão_1;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	
	public Data( int dia, int mes, int ano )
	{
		if ( dia >= 1 && dia <= 30 )
		{
			this.dia = dia;
		}
		else {
			this.dia = 01;
		}
		
		if ( mes >= 1 && mes <= 12 )
		{
			this.mes = mes;
		}
		else {
			this.mes = 01;
		}
		
		if ( ano <= 2022 )
		{
			this.ano = ano;
		}
		else {
			this.ano = 0001;
		}
	}

	public int compara( Data data )
	{
		if ( data.getDia() == dia && data.getMes() == mes 
			&& data.getAno() == ano )
		{
			return 0;
		}
		else if ( data.getAno() > ano )
		{
			return -1;
		}
		else if ( data.getAno() < ano )
		{
			return 1;
		}
		else 
		{
			if ( data.getMes() > mes )
			{
				return -1;
			}
			else if ( data.getMes() < mes )
			{
				return 1;
			}
			else
			{
				if ( data.getDia() > dia )
				{
					return -1;
				}
				else 
				{
					return 1;
				}
			}
		}
	}
	
	public int getAno() {
		return ano;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}
}
