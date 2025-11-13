package main;

import java.util.Scanner;

public class ArrayConMetodos {
    public static void main(String[] args) {
        // Declaramos array de strings
        String[] palabras;
        // Instancia de un array de 5 elementos
        palabras = new String[5];

        rellenarArray(palabras);
    
        mostrarArray(palabras);
    }// fin main

    public static String[] rellenarArray(String[] arreglo) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Introduce la palabra " + (i + 1) + ": ");
            arreglo[i] = entrada.nextLine();
        }
        return arreglo;

    }

    public static void mostrarArray(String[] palabras) {
        System.out.println("Las palabras introducidas son:");
        for (String cadena : palabras) {
            System.out.println(cadena);
        }
    }
}// fin de clase
