package clases;

public class Aplicacion {

	public static void main(String[] args) {
		boolean caso1= Algoritmos.esPar(100);
		boolean caso1A= Algoritmos.esPar(53);
		System.out.println("--------------");
		
		boolean caso2= Algoritmos.esPrimo(22);
		boolean caso2A= Algoritmos.esPrimo(89);
		System.out.println("--------------");
		
		String caso3= Algoritmos.stringEnReversa("palta");
		String caso3A= Algoritmos.stringEnReversa("severla");
		System.out.println("--------------");
		
		boolean caso4= Algoritmos.esPalindromo("radar");
		boolean caso4A= Algoritmos.esPalindromo("huevito");
		System.out.println("--------------");
		
		Algoritmos.secuenciaFizzBuzz(20);
		System.out.println("--------------");
	}

}
