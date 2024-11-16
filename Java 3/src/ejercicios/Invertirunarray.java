package ejercicios;

public class Invertirunarray {
public static void main(String[] args) {
	
	int[] numeros = {10, 20, 30, 40, 50};
	
	int[] numerosInvertidos = new int[numeros.length];
	
	for (int i = 1; i < numeros.length; i++) {
		numerosInvertidos[i] = numeros[numeros.length - 1 - i];
	}
		
		System.out.println("Array invertido:");
		for (int i = 0; i < numerosInvertidos.length; i++) {
			System.out.println(numerosinvertidos[i] + "");
			
		}
	}

}

