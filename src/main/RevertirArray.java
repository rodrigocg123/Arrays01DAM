package main;

/**
 * Clase RevertirArray - Reversión de arrays de enteros.
 * 
 * Esta clase proporciona métodos para revertir el orden de los elementos
 * en un array de enteros y mostrar su contenido en consola.
 * 
 * @author Usuario
 * @version 1.0
 * @since 2025
 */
public class RevertirArray {
    
    /**
     * Método principal que coordina la ejecución del programa.
     * 
     * Crea un array de enteros, lo revierte y muestra tanto el array original
     * como el array revertido en consola.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        //declaramos array de enteros
        int[] numeros = {1, 2, 3, 4, 5};
        int[] Revertidos = revertirArray(numeros);
        System.out.println("Array original:");
        mostrarArray(numeros);
        System.out.println("\n Array revertido:");
        mostrarArray(Revertidos);
    }
    
    /**
     * Revierte el orden de los elementos en un array de enteros.
     * 
     * Crea un nuevo array con los elementos del array original en orden inverso.
     * El array original no se modifica.
     * 
     * @param arreglo Array de enteros a revertir
     * @return Un nuevo array con los elementos en orden inverso
     * 
     * @example
     * int[] numeros = {1, 2, 3, 4, 5};
     * int[] revertidos = revertirArray(numeros);
     * // revertidos contiene {5, 4, 3, 2, 1}
     */
    public static int[] revertirArray(int[] arreglo) {
        int n = arreglo.length;
        int[] arregloRevertido = new int[n];
        for (int i = 0; i < n; i++) {
            arregloRevertido[i] = arreglo[n - 1 - i];
        }
        return arregloRevertido;
    }
    
    /**
     * Muestra en consola el contenido de un array de enteros.
     * 
     * Imprime cada elemento del array separado por espacios en la misma línea.
     * 
     * @param arreglo Array de enteros a mostrar en la consola
     * 
     * @example
     * int[] numeros = {1, 2, 3, 4, 5};
     * mostrarArray(numeros);
     * // Output: 1 2 3 4 5
     */
    public static void mostrarArray(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }
}// fin de clase
