package main;

import java.util.Arrays;

public class ArraysMatrizes {

    public static void main(String[] args) {
        System.out.println("Inicio");
        int contador = 1;
        int [][] matriz = new int[3][5];
        System.out.println("Rellenando matriz");
        System.out.println("----------------------");
        System.out.println("Mostrando matriz");
        System.out.println("----------------------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = contador;
                contador++;
            }
        }
        System.out.println(Arrays.toString(matriz));
        System.out.println("Mostrando matriz Ordenada");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        for (int [] filas : matriz) {
            for (int elemento : filas) {
                System.out.println(elemento + "\t");
            }
            System.out.println();
        }

    }
}