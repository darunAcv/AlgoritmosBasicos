

	/*Los comentarios son para métodos que me costó hacer o llegar a dicha solución, 
	 * en estos me apoyé de compañeros e internet, tratando de limitarme por lo 
	 * aprendido en clase. Estos comentarios fueron escritos específicamente 
	 * para ayudarme a entender mejor el código y lo que estaba haciéndo con lo escrito.*/

public class Algoritmos {

	public static boolean esPar(int numero) {
		boolean es;
		if (numero % 2 == 0) {
			es = true;
			System.out.println("El número "+numero+" es par." );
		} else {
			es = false;
			System.out.println("El número "+numero+" no es par." );
		}
		return es;
	}
	
	//este no logré hacerlo funcionar :-(
	public static boolean esPrimo(int numero) {
		boolean es;
		
		if (numero % numero == 0 && numero % 1 == 0) {
			es = true;
			System.out.println("El número "+numero+" es número primo.");
		} else {
			es = false;
			System.out.println("El número "+numero+" no es número primo.");
		}
		return es;
	}
	
	public static String stringEnReversa(String reversa) {
		
		//String para return
		String severla="";
		
		//char para seleccionar las letras individualmente
		char letra;
		
		//bucle inicializado en indice 0, si indice 0 es menor que el tamaño de var reversa, aumenta en 1
		for(int i=0; i<reversa.length(); i++) {
			
			//letra individual seleccionada dentro de la var reversa, seleccionada mediante charAt(indice)
			letra= reversa.charAt(i);
			
			//severla= String vacío, letra + severla => añade la letra en orden al revés por cada iteración del bucle
			severla=letra+severla;
		}
		//sysout 
		System.out.println("La palabra " +reversa+" al revés es "+severla);
		
		//return, regresa severla (el string construído) una vez finaliza el bucle
		return severla;
	}
	
	public static boolean esPalindromo(String palabra) {
		
		//reutilizamos el codigo anterior para revertir la palabra, añadimos la variable severla para su funcionamiento
		String severla="";
		char letra;
		
			for(int i=0; i<palabra.length(); i++) {
				letra= palabra.charAt(i);
				severla=letra+severla;
			}
			//condicional para print 
			if(palabra.equalsIgnoreCase(severla) == true ) {
				System.out.println("La palabra "+palabra+" es palíndromo.");
			} else {
				System.out.println("La palabra "+palabra+" no es palíndromo.");
			}
			
			//return, regresa boolean de comparación entre la var palabra y var severla generada con el bucle, ignorando mayúsculas y minúsculas 
		return palabra.equalsIgnoreCase(severla); //equalsIgnoreCase regresa un valor boleano
	}
	
	public static void secuenciaFizzBuzz(int numero) {
		
		//bucle for
		for (int i=1; i<numero; i++) {
			if( i % 3 == 0 && i % 5 == 0 ) {
				System.out.println("FizzBuzz");
			} else if ( i % 5 == 0 ) {
				System.out.println("Buzz");
			} else if (i % 3 == 0 ) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}
	}

}
