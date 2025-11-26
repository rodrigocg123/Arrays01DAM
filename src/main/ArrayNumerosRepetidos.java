package main;

import java.util.Scanner;

public class ArrayNumerosRepetidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
        // Solicitar al usuario que ingrese 10 números entre 0 y 10
        System.out.println("Ingrese 10 números entre 0 y 10:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();
        num5 = scanner.nextInt();
        num6 = scanner.nextInt();
        num7 = scanner.nextInt();
        num8 = scanner.nextInt();
        num9 = scanner.nextInt();
        num10 = scanner.nextInt();
        scanner.close();
        // Validar que los números estén entre 0 y 10
        if (num1 < 0 || num1 > 10 || num2 < 0 || num2 > 10 || num3 < 0 || num3 > 10 || num4 < 0 || num4 > 10 || num5 < 0
                || num5 > 10 ||
                num6 < 0 || num6 > 10 || num7 < 0 || num7 > 10 || num8 < 0 || num8 > 10 || num9 < 0 || num9 > 10
                || num10 < 0 || num10 > 10) {
            System.out.println("Error: Todos los números deben estar entre 0 y 10.");
            return;
        }

        int[] numeros = { num1, num2, num3, num4, num5, num6, num7, num8, num9, num10 };
        

        encontrarNumerosRepetidos(numeros);// Llamar al método para encontrar números repetidos
        contarRepetidos(numeros);// Llamar al método para contar números repetidos
    }

    public static void encontrarNumerosRepetidos(int[] array) {
        boolean[] vistos = new boolean[11]; // Asumiendo que los números están entre 0 y 10
        boolean[] repetidos = new boolean[11];
        int contador = 0;

        for (int numero : array) {// Recorre cada número en el array
            if (vistos[numero]) {// Si ya se ha visto el número, marcarlo como repetido
                repetidos[numero] = true;
            } else {// Si no se ha visto, marcarlo como visto
                vistos[numero] = true;
            }
        }// Fin del bucle para encontrar números repetidos
        System.out.println("Números repetidos en el array:");
        for (int i = 0; i < repetidos.length; i++) {// Imprimir los números repetidos
            if (repetidos[i]) {
                System.out.println(i);
            }
        } // Fin del bucle para imprimir números repetidos

    }// Fin del método encontrarNumerosRepetidos

    public static int contarRepetidos(int[] array) {
        boolean[] vistos = new boolean[11];
        boolean[] repetidos = new boolean[11];
        int contador = 0;

        for (int numero : array) {// Recorre cada número en el array
            if (vistos[numero]) {
                repetidos[numero] = true;
            } else {
                vistos[numero] = true;
            }
        }
        for (int i = 0; i < repetidos.length; i++) {// Contar la cantidad de números repetidos
            if (repetidos[i]) {
                contador++;
            }
        } // Fin del bucle para contar números repetidos
        if (contador == 0) {
            System.out.println("No hay números repetidos en el array.");
        } else {
            System.out.println("Cantidad de números repetidos: " + contador);
        }
        return contador;
    }

}// Fin de la clase ArrayNumerosRepetidos