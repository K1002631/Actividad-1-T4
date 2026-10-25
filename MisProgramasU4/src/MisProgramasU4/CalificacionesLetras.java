package MisProgramasU4;

import java.util.Scanner;

public class CalificacionesLetras {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;
        char letra;

        System.out.println("--- EVALUACIÓN DE CALIFICACIONES CON LETRAS ---");
        System.out.print("Ingresa la calificacion numerica (0-100): ");
        nota = teclado.nextInt();

        // Validamos que la nota esté en el rango correcto
        if (nota < 0 || nota > 100) {
            System.out.println("Error: La calificacion debe estar entre 0 y 100.");
        } else {
            // Estructura if / else if para asignar la letra según el rango
            if (nota >= 90) {
                letra = 'A';
            } else if (nota >= 80) {
                letra = 'B';
            } else if (nota >= 70) {
                letra = 'C';
            } else if (nota >= 60) {
                letra = 'D';
            } else {
                letra = 'F';
            }

            System.out.println("La letra asignada para la calificacion es: " + letra);
        }
    }
}