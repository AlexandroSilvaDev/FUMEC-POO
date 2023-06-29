package questão_3;

public class Main {

	public static void main(String[] args) {
		Data data = new Data(29, 2, 2020);
		Data data2 = new Data(28, 2, 2020);
		
		System.out.println(data);
		data.setAno(2022);
		System.out.println(data);
		
		System.out.println(data.compara(data2));
		System.out.println(data2.compara(data));
		
	}

}
