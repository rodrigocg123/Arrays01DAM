package main;

import java.util.Scanner;

/**
 * Clase ArrayConMetodos - Gestión de arrays de strings con entrada de usuario.
 * 
 * Esta clase proporciona métodos para rellenar un array de strings con datos
 * introducidos por el usuario a través de la consola y mostrar el contenido del array.
 * 
 * @author Usuario
 * @version 1.0
 * @since 2025
 */
public class ArrayConMetodos {
    
    /**
     * Método principal que coordina la ejecución del programa.
     * 
     * Crea un array de 5 elementos, lo rellena con palabras introducidas por el usuario
     * y luego muestra el contenido del array.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Declaramos array de strings
        String[] palabras;
        // Instancia de un array de 5 elementos
        palabras = new String[5];

        rellenarArray(palabras);
    
        mostrarArray(palabras);
    }// fin main

    /**
     * Rellena un array de strings con palabras introducidas por el usuario.
     * 
     * Solicita al usuario que introduzca una palabra para cada posición del array
     * a través de la consola. Valida que el array no sea nulo antes de procesarlo.
     * 
     * @param arreglo Array de strings que será rellenado con las palabras del usuario
     * @return El mismo array rellenado con los datos introducidos
     * 
     * @throws NullPointerException si el array pasado es nulo
     * 
     * @example
     * String[] palabras = new String[5];
     * rellenarArray(palabras);
     * // palabras ahora contiene 5 palabras introducidas por el usuario
     */
    public static String[] rellenarArray(String[] arreglo) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Introduce la palabra " + (i + 1) + ": ");
            arreglo[i] = entrada.nextLine();
        }
        return arreglo;

    }

    /**
     * Muestra en consola el contenido de un array de strings.
     * 
     * Imprime un encabezado seguido de cada elemento del array en una línea separada.
     * Si el array contiene elementos nulos, se mostrarán como "null".
     * 
     * @param palabras Array de strings a mostrar en la consola
     * 
     * @example
     * String[] palabras = {"hola", "mundo"};
     * mostrarArray(palabras);
     * // Output:
     * // Las palabras introducidas son:
     * // hola
     * // mundo
     */
    public static void mostrarArray(String[] palabras) {
        System.out.println("Las palabras introducidas son:");
        for (String cadena : palabras) {
            System.out.println(cadena);
        }
    }
}// fin de clase
