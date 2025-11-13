package main;

public class RevertirArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int[] Revertidos = revertirArray(numeros);
        System.out.println("Array original:");
        mostrarArray(numeros);
        System.out.println("\nArray revertido:");
        mostrarArray(Revertidos);
    }
    public static int[] revertirArray(int[] arreglo) {
        int n = arreglo.length;
        int[] arregloRevertido = new int[n];
        for (int i = 0; i < n; i++) {
            arregloRevertido[i] = arreglo[n - 1 - i];
        }
        return arregloRevertido;
    }
    public static void mostrarArray(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }
}
