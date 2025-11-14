package main;

import java.util.Scanner;

public class TrasteoArrays {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declaramos array de strings
        String[] palabras = new String[5]; // ← Crea el array de 5 elementos
        // Instancia de un array de 5 elementos
        int[] numeros = new int[5];

        rellenarArray(palabras, numeros); // ← Pasa el array como parámetro

        mostrarArray(palabras, numeros); // <-- mostrar el array

        entrada.close();
    }// fin main
     // metodo que muestra arrays

    public static void mostrarArray(String[] array, int[] numeros) {
        // muestra array de Strings
        System.out.println("Las palabras introducidas son:");
        for (String palabra : array) {
            System.out.print(palabra + " ");
        }
        // muestra la palabra invertida
        System.out.println("\nLas palabras invertidas son:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        // muestra array de enteros
        System.out.println("\nLos enteros introducidos son:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println("\nLos enteros invertidos son:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }// fin metodo mostrarArray
     // metodo que rellena arrays

    public static String[] rellenarArray(String[] array, int[] numeros) {
        Scanner entrada = new Scanner(System.in);
        // Rellena array de Strings
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce la palabra " + (i + 1) + ": ");
            array[i] = entrada.nextLine();
        }
        // rellena array de enteros
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        return array;
    }// fin metodo rellenarArray

}// fin de clase
