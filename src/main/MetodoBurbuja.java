package main;

import java.util.Arrays;

public class MetodoBurbuja {
    public static void main(String[] args) {
        // Crear y rellenar el array
        int[] array = new int[10];
        System.out.println("----------------------");
        // Rellenar el array con números aleatorios
        ParesImpares.rellenarArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("----------------------");
        System.out.println("Array original:" + Arrays.toString(array));
        System.out.println("----------------------");
        // Algoritmo de ordenación burbuja
        // 
        for (int i = 0; i < array.length - 1; i++) {
            //compara parejas del array
            for (int j = 0; j < array.length - 1 - i; j++) {    
            // Si el elemento actual es mayor que el siguiente
            if (array[j] > array[j + 1]) {
                // Intercambiar array[j] y array[j + 1]
                int temporal = array[j];
                //swap
                array[j] = array[j + 1];
                //swap
                array[j + 1] = temporal;
            }//fin if j
            }//fin for j
            //mostrar el array en cada pasada
            System.out.println("Pasada " + (i + 1) + ":");
            for (int k = 0; k < array.length; k++) {
                System.out.print(array[k] + " ");
            }
            System.out.println(array[i]);
        }//fin for i
        System.out.println("----------------------");
        System.out.println("Array ordenado:" + Arrays.toString(array));
        System.out.println("----------------------");
    }
}