package ejercicios;

	import java.util.Arrays;
	import java.util.Collections;

	public class Ordenararraydeescendente {
	 public static void main(String[] args) {
		 
	        // Definir el array de enteros
	        Integer[] numeros = {5, 2, 8, 4, 1, 3, 7, 6};

	        // Mostrar el array antes de ordenar
	        System.out.println("Array original: " + Arrays.toString(numeros));

	        // Ordenar el array en orden descendente
	        Arrays.sort(numeros, Collections.reverseOrder());

	        // Mostrar el array después de ordenar
	        System.out.println("Array ordenado en orden descendente: " + Arrays.toString(numeros));
	    }
	}
	


