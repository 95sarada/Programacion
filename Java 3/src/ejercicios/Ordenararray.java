package ejercicios;

import java.util.Arrays;

public class Ordenararray {
    public static void main(String[] args) {
        // Definir el array de enteros
        int[] numeros = {5, 2, 8, 4, 1, 3, 7, 6};

        // Mostrar el array antes de ordenar
        System.out.println("Array original: " + Arrays.toString(numeros));

        // Ordenar el array
        Arrays.sort(numeros);

        // Mostrar el array después de ordenar
        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }
}

