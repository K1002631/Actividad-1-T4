package MisProgramasU4;

import java.util.Scanner;

public class BrindarInformacion {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String artista;

        System.out.println("--- Buscador de Informacion de Artistas ---");
        System.out.println("Opciones disponibles: Shakira, Luis Miguel, Eminem, Taylor Swift, Bad Bunny");
        System.out.print("Escribe el nombre de uno de estos artistas: ");
        
        // Leemos el texto y lo pasamos a minusculas para evitar fallas por mayusculas
        artista = teclado.nextLine().toLowerCase().trim();

        System.out.println("\n--- Resultado de la Busqueda ---");
        
        // Estructura switch para evaluar cadenas de texto (Strings)
        switch (artista) {
            case "shakira":
                System.out.println("Artista: Shakira");
                System.out.println("Info: Cantautora colombiana conocida como la Reina del Pop Latino.");
                System.out.println(" some hits: 'Hips Don't Lie', 'Waka Waka' y 'Antologia'.");
                break;
            case "luis miguel":
                System.out.println("Artista: Luis Miguel");
                System.out.println("Info: Cantante mexicano apodado 'El Sol de Mexico', famoso por sus boleros.");
                System.out.println(" some hits: 'La Incondicional', 'Hasta Que Me Olvides'.");
                break;
            case "eminem":
                System.out.println("Artista: Eminem");
                System.out.println("Info: Rapero, productor y actor estadounidense, uno de los mas influyentes del rap.");
                System.out.println(" some hits: 'Lose Yourself', 'Without Me', 'Not Afraid'.");
                break;
            case "taylor swift":
                System.out.println("Artista: Taylor Swift");
                System.out.println("Info: Cantautora estadounidense multi-premiada, famosa por sus narrativas en canciones.");
                System.out.println(" some hits: 'Blank Space', 'Shake It Off', 'Cruel Summer'.");
                break;
            case "bad bunny":
                System.out.println("Artista: Bad Bunny");
                System.out.println("Info: Cantante de Puerto Rico, uno de los maximos exponentes del trap y reggaeton.");
                System.out.println(" some hits: 'Dakiti', 'Titi Me Pregunto', 'Monaco'.");
                break;
            default:
                // Si el usuario escribe cualquier otra cosa
                System.out.println("Lo siento, no tengo informacion registrada sobre ese artista.");
                break;
        }
    }
}