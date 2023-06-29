package Zoo;

public class App {

	public static void main(String[] args) {
		
		Arara a1 = new Arara(2, "Ana", "Azul");
		
		Onca o1 = new Onca(4, "Amanda", "Africa");
		
		Leao l1 = new Leao(4, "Simba", 10);
		
		System.out.println(a1.getCorPredominante());
		System.out.println(o1.getRegiao());
		System.out.println(l1.getTamanhoDaJuba());
	}

}
