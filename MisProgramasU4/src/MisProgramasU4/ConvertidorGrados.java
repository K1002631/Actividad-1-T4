package MisProgramasU4;

import java.util.Scanner;

public class ConvertidorGrados {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double celsius, resultado;
        int opcion;

        System.out.println("--- CONVERTIDOR DE GRADOS ---");
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        celsius = entrada.nextDouble();

        // Mostrar el menú de opciones para que el usuario elija
        System.out.println("\n¿A que escala deseas convertir?");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        System.out.print("Elige una opcion (1 o 2): ");
        opcion = entrada.nextInt();

        // Switch para realizar la conversion elegida
        switch (opcion) {
            case 1:
                // Formula para Fahrenheit: (C * 9/5) + 32
                resultado = (celsius * 9 / 5) + 32;
                System.out.println(celsius + " grados Celsius equivalen a " + resultado + " grados Fahrenheit.");
                break;
            case 2:
                // Formula para Kelvin: C + 273.15
                resultado = celsius + 273.15;
                System.out.println(celsius + " grados Celsius equivalen a " + resultado + " grados Kelvin.");
                break;
            default:
                // Si eligen una opcion que no existe en el menu
                System.out.println("Error: Opcion no valida.");
                break;
        }
    }
}
