package MisProgramasU4;

import java.util.Scanner;

public class VerificarVoto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;

        System.out.println("--- VERIFICACIÓN DE EDAD PARA VOTAR ---");
        System.out.print("Por favor, ingresa tu edad: ");
        edad = entrada.nextInt();

        // Estructura condicional para validar la edad mínima
        if (edad >= 18) {
            System.out.println("Eres elegible para votar. ¡Cumples con la edad minima!");
        } else {
            System.out.println("No eres elegible para votar. Debes tener al menos 18 anos.");
        }
    }
}