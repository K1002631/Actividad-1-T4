package MisProgramasU4;

import java.util.Scanner;

public class DeterminarEstacion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mes;

        System.out.println("--- DETERMINAR LA ESTACIÓN DEL AÑO ---");
        System.out.print("Ingresa el numero de mes (1 - 12): ");
        mes = entrada.nextInt();

        // Estructura switch agrupando los meses por estacion
        switch (mes) {
            case 12:
            case 1:
            case 2:
                System.out.println("La estacion es: Invierno");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("La estacion es: Primavera");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("La estacion es: Verano");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("La estacion es: Otono");
                break;
            default:
                // Si el usuario mete un numero que no es del 1 al 12
                System.out.println("Error: El numero de mes ingresado no es valido.");
                break;
        }
    }
}