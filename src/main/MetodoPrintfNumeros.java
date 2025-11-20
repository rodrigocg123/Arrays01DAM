package main;

public class MetodoPrintfNumeros {
    public static void main(String[] args) {
        int valorEntero = 42, otroEntero = 7;

        System.out.println("Ejemplo de uso de printf con Números:\n");
        System.out.printf("Valor entero: %d \notroEntero: %d\n", valorEntero, otroEntero);
        System.out.printf("Valor entero con formato de 5 dígitos: %05d%n", valorEntero);
    }
}
