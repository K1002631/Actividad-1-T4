package MisProgramasU4;

import java.util.Scanner;

public class CalcularDescuento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precioOriginal, descuento, precioFinal;

        System.out.println("--- CÁLCULO DE PRECIO CON DESCUENTO ---");
        System.out.print("Ingresa el precio original del producto: ");
        precioOriginal = scanner.nextDouble();

        // Validar que el precio ingresado sea válido
        if (precioOriginal < 0) {
            System.out.println("Error: El precio no puede ser menor a 0.");
        } else {
            // Condicionales para obtener el porcentaje de descuento
            if (precioOriginal <= 100) {
                descuento = 0.0; // Sin descuento
            } else if (precioOriginal <= 200) {
                descuento = 0.10; // 10% de descuento
            } else if (precioOriginal <= 500) {
                descuento = 0.20; // 20% de descuento
            } else {
                descuento = 0.25; // 25% de descuento
            }

            // Realizar las operaciones matemáticas básicas
            precioFinal = precioOriginal - (precioOriginal * descuento);

            System.out.println("\n--- Resumen de Compra ---");
            System.out.println("Precio original: $" + precioOriginal);
            System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
            System.out.println("Precio final a pagar: $" + precioFinal);
        }
    }
}