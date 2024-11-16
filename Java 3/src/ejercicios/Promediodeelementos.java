package ejercicios;

public class Promediodeelementos {
public static void main (String[] args) {
	
	float[] numeros = {3.4f, 4.5f, 2.1f, 5.1f, 8,2f, 1.5f};
	
	float suma = 0;
	
	for (int i = 0; i < numeros.length; i++) {
		suma += numeros[i];
	}
	
		float promedio = suma / numeros.length;
		
		System.out.println("el promedios de los numeros es:" + promedio);
		
		
	
	
}
}
