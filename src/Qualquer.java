/**
 * Classe que demonstra o funcionamento
 * do método main
 * 
 * @author Alexandre
 *
 */
public class Qualquer {
	public static void main(String[] args) {
		System.out.println("Olá mundo.");
		
		int res = calc(2,2);
		
		System.out.println(res);
		
		System.out.println("Fim.");
	}

	private static int calc(int i, int j) {
		return i+j;
	}
}
