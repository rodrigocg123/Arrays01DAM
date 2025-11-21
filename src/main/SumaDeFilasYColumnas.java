package main;

import java.util.Scanner;

public class SumaDeFilasYColumnas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // declaro valores introducidos por el usuario
        System.out.println("Introduce el número de filas:");
        int numFilas = new Scanner(System.in).nextInt();
        System.out.println("Introduce el número de columnas:");
        int numColumnas = new Scanner(System.in).nextInt();
        // Crear la matriz con las dimensiones especificadas
        int matriz[][] = new int[numFilas][numColumnas];

        // Rellenar la matriz con datos introducidos por el usuario
        rellenarMatriz(matriz);
        // Mostrar la matriz
        mostrarMatriz(matriz);
        System.out.println("----------------------");
        System.out.println("Opciones:");
        System.out.println("1. Sumar filas");
        System.out.println("2. Sumar columnas");
        System.out.println("----------------------");
        // Selección de la operación a realizar
        System.out.println("Seleccione una opción (1 o 2):");
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Dime que fila quieres sumar (0 a " + (numFilas - 1) + "):");
                int opcionFila = entrada.nextInt();
                if (opcionFila < 0 || opcionFila >= numFilas) {
                    System.out.println("Fila no válida.");
                    break;
                }
                System.out.println("La suma de la fila " + opcionFila + " es: " + sumaFila(matriz, opcionFila));
                break;
            case 2:
                System.out.println("Dime que columna quieres sumar (0 a " + (numColumnas - 1) + "):");
                int opcionColumna = entrada.nextInt();
                if (opcionColumna < 0 || opcionColumna >= numColumnas) {
                    System.out.println("Columna no válida.");
                    break;
                }
                System.out.println("La suma de la columna " + opcionColumna + " es: " +
                        sumaColumna(matriz, opcionColumna));
                break;
            default:
                break;
        }// fin switch
        entrada.close();// cerrar scanner
    }

    // muestra la matriz por pantalla
    public static void mostrarMatriz(int[][] matriz) {
        System.err.println("----------------------");
        System.out.println("MATRIZ:");
        System.err.println("----------------------");
        // encabezado de columnas
        for (int col = 0; col < matriz[0].length; col++) {
            System.out.print("Col" + col + "\t");
        }
        System.out.println();
        System.out.println("----------------------");

        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] +"\t");
            }
            System.out.println("| "+ "Fila "+i); 
        }
    }

    // rellena la matriz con numeros aleatorios
    public static void rellenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 20);
            }
        }
    }

    // calcula la suma de una fila
    public static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < matriz[fila].length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }

    // calcula la suma de una columna
    public static int sumaColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }
}
