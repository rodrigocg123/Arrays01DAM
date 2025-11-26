package main;

import java.util.Scanner;

public class ArrayMiCompraSuper {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[][] productos = {
                { "Manzanas", "2.5" },
                { "Pan", "1.2" },
                { "Leche", "0.8" },
                { "Huevos", "1.5" },
                { "Queso", "3.0" }
        };// declaramos una matriz para almacenar el nombre y precio de los productos

        // Matriz para almacenar el carrito: [nombre, cantidad, subtotal]
        String[][] carrito = new String[20][3]; // Máximo 20 productos diferentes
        int contadorProductos = 0; // Contador de productos en el carrito

        boolean seguirComprando = true;

        while (seguirComprando) {//bucle para seguir comprando
            System.out.println("\n-------------------------------");
            System.out.println("------Oferta de la semana------");
            System.out.println("-------------------------------");
            System.out.println("1. Manzanas: 2.5 EUR/kg");
            System.out.println("2. Pan: 1.2 EUR/unidad");
            System.out.println("3. Leche: 0.8 EUR/litro");
            System.out.println("4. Huevos: 1.5 EUR/docena");
            System.out.println("5. Queso: 3.0 EUR/paquete");
            System.out.println("0. Terminar compra");
            System.out.println("-------------------------------");

            System.out.println("Elija el producto que desea comprar (1-5, 0 para terminar):");
            int opcion = entrada.nextInt();

            if (opcion == 0) {//terminar la compra
                seguirComprando = false;//si la opcion es 0, salir del bucle ya que cambia el boolean
                break;
            }
            if (opcion < 0 || opcion > 5) {//opcion no valida
                System.out.println("Opción no válida.");
                continue;
            }

            System.out.println("Ingrese la cantidad que desea comprar:");//Pedir la cantidad
            double cantidad = entrada.nextDouble();

            // Guardar el producto, cantidad y subtotal
            double precioUnitario = Double.parseDouble(productos[opcion - 1][1]);//obtenemos el precio unitario
            double subtotal = cantidad * precioUnitario;//calculamos el subtotal

            /**
             * Almacena los datos de la compra en la matriz carrito
             * 
             * carrito[contadorProductos][0] = productos[opcion - 1][0]
             *   - Accede a la fila actual del carrito según contadorProductos
             *   - [0] representa la primera columna (nombre del producto)
             *   - productos[opcion - 1][0] obtiene el nombre del producto seleccionado
             *   - Se usa (opcion - 1) porque las opciones son 1-5 pero los índices son 0-4
             *   - Ejemplo: Si opción = 2 (Pan), obtiene productos[1][0] = "Pan"
             * 
             * carrito[contadorProductos][1] = String.valueOf(cantidad)
             *   - [1] representa la segunda columna (cantidad)
             *   - String.valueOf() convierte el double a String
             *   - Es necesario porque la matriz carrito es de tipo String[][]
             *   - Ejemplo: Si cantidad = 3.0, guarda "3.0"
             * 
             * carrito[contadorProductos][2] = String.valueOf(subtotal)
             *   - [2] representa la tercera columna (subtotal)
             *   - String.valueOf() convierte el double a String
             *   - Ejemplo: Si subtotal = 7.5, guarda "7.5"
             */
            carrito[contadorProductos][0] = productos[opcion - 1][0];//nombre del producto
            carrito[contadorProductos][1] = String.valueOf(cantidad);//cantidad
            carrito[contadorProductos][2] = String.valueOf(subtotal);//subtotal

            contadorProductos++;//incrementamos el contador

            System.out.println("✓ Producto agregado al carrito ✓");
        }

        entrada.close();

        // Mostrar lista de compra
        if (contadorProductos == 0) {//si no hay productos en el carrito
            System.out.println("\nNo ha comprado nada.");
        } else {//si hay productos en el carrito
            System.out.println("\n================================");
            System.out.println("--------LISTA DE COMPRA---------");
            System.out.println("================================");

            double totalGeneral = 0.0;
            for (int i = 0; i < contadorProductos; i++) {//recorremos el carrito
                double subtotal = Double.parseDouble(carrito[i][2]);//obtenemos el subtotal
                totalGeneral += subtotal;//sumamos al total general
                System.out.printf("%s: %.2f EUR%n", carrito[i][0], subtotal);
                //mostramos el producto y su subtotal
            }

            System.out.println("================================");
            System.out.printf("TOTAL A PAGAR: %.2f EUR%n", totalGeneral);//mostramos el total a pagar con formato
            System.out.println("================================");
        }
    }

}
