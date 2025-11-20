package main;

import java.util.Scanner;

public class MetodoPrintfString {
    public static void main(String[] args) {
        String nombre = PedirNombre();
        System.out.println("-------------------------------");
        System.out.println("Ejemplo de uso de printf con String:");
        mostrarConPrintf(nombre);
        System.out.println("\n-------------------------------");

    }

    public static String PedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = entrada.nextLine();
        entrada.close();
        return nombre; 
    }// fin pedirNombre
    public static String mostrarConPrintf(String nombre) {
        System.out.printf("Hola, %s!", nombre);
        return nombre;
    }//fin mostrarConPrintf

}
