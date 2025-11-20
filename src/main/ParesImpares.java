package main;

import java.util.Arrays;

public class ParesImpares {

	public static void main(String[] arg) {

		// Crear 2 arrays, uno con pares, otro con impares

		int[] completo = new int[(int) (Math.random() * 20) + 1];

		rellenarArray(completo);

		// Mostrar los arrays
	}

	public static void rellenarArray(int[] arrayCompleto) {
		System.out.println("Rellenando el array de " + arrayCompleto.length + " elementos");

		for (int i = 0; i < arrayCompleto.length; i++) {
			arrayCompleto[i] = (int) (Math.random() * 101);
		}
	}

	public static void mostrarArrays(int[] arrayCompleto) {

		int numPares = 0;

		for (int elemento : arrayCompleto) {
			if (elemento % 2 == 0) {
				numPares++;
			}

		}

		int[] pares = new int[numPares];
		int[] impares = new int[arrayCompleto.length - numPares];

		int posPar = 0, posImpar = 0;

		for (int elemento : arrayCompleto) {
			if (elemento % 2 == 0) {
				pares[posPar] = elemento;
				posPar++;
			} else {
				impares[posImpar] = elemento;
				posImpar++;

			}
		}
		System.out.println(
				"Array de pares -> " + Arrays.toString(pares) + "\n" +
						"Array de impares -> " + Arrays.toString(impares));
	}
}