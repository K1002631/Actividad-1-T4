package MisProgramasU4;

import java.util.Scanner;

public class CalculadoraCalificaciones {

    public static void main(String[] args) {
        // Crear el scanner para leer los datos del teclado
        Scanner teclado = new Scanner(System.in);
        
        // Variables para guardar las notas
        double parciales, proyecto, examenFinal, promedioFinal;
        
        System.out.println("--- CALCULADORA DE CALIFICACIONES FINALES ---");
        
        // Pedir y validar la nota de Parciales
        System.out.print("Ingresa la calificacion de Parciales (0-100): ");
        parciales = teclado.nextDouble();
        if (parciales < 0 || parciales > 100) {
            System.out.println("Error: La calificacion debe estar entre 0 y 100.");
            return; // Termina el programa si está mal
        }
        
        // Pedir y validar la nota del Proyecto
        System.out.print("Ingresa la calificacion del Proyecto (0-100): ");
        proyecto = teclado.nextDouble();
        if (proyecto < 0 || proyecto > 100) {
            System.out.println("Error: La calificacion debe estar entre 0 y 100.");
            return;
        }
        
        // Pedir y validar la nota del Examen Final
        System.out.print("Ingresa la calificacion del Examen Final (0-100): ");
        examenFinal = teclado.nextDouble();
        if (examenFinal < 0 || examenFinal > 100) {
            System.out.println("Error: La calificacion debe estar entre 0 y 100.");
            return;
        }
        
        // Calcular el promedio final usando los porcentajes correspondientes
        promedioFinal = (parciales * 0.40) + (proyecto * 0.30) + (examenFinal * 0.30);
        
        // Mostrar el resultado en la pantalla
        System.out.println("\n-------------------------------------------");
        System.out.println("El promedio final del estudiante es: " + promedioFinal);
        System.out.println("-------------------------------------------");
    }
}