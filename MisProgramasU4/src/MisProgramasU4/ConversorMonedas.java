package MisProgramasU4;

import java.util.Scanner;

public class ConversorMonedas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double pesos, resultado;
        int opcion;

        System.out.println("--- CONVERSOR DE MONEDAS (DESDE PESOS MEXICANOS) ---");
        System.out.print("Ingresa la cantidad en pesos mexicanos (MXN): ");
        pesos = teclado.nextDouble();

        // Validar que no pongan dinero negativo
        if (pesos < 0) {
            System.out.println("Error: La cantidad no puede ser menor a 0.");
            return;
        }

        // Mostrar menú con las 10 opciones solicitadas
        System.out.println("\n¿A que moneda deseas convertir?");
        System.out.println("1. Dolar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Bath (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dolar Australiano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dolar Canadiense (CAD)");
        System.out.println("9. Bolivar (VES)");
        System.out.println("10. Peso Argentino (ARS)");
        System.out.print("Elige una opcion (1-10): ");
        opcion = teclado.nextInt();

        // Switch para realizar la conversion con tasas fijas aproximadas
        switch (opcion) {
            case 1:
                resultado = pesos * 0.050;
                System.out.println("$" + pesos + " MXN equivalen a $" + resultado + " USD.");
                break;
            case 2:
                resultado = pesos * 0.046;
                System.out.println("$" + pesos + " MXN equivalen a " + resultado + " EUR.");
                break;
            case 3:
                resultado = pesos * 1.70;
                System.out.println("$" + pesos + " MXN equivalen a " + resultado + " THB.");
                break;
            case 4:
                resultado = pesos * 7.60;
                System.out.println("$" + pesos + " MXN equivalen a " + resultado + " JPY.");
                break;
            case 5:
                resultado = pesos * 69.50;
                System.out.println("$" + pesos + " MXN equivalen a " + resultado + " KRW.");
                break;
            case 6:
                resultado = pesos * 0.076;
                System.out.println("$" + pesos + " MXN equivalen a $" + resultado + " AUD.");
                break;
            case 7:
                resultado = pesos * 0.19;
                System.out.println("$" + pesos + " MXN equivalen a " + resultado + " PEN.");
                break;
            case 8:
                resultado = pesos * 0.070;
                System.out.println("$" + pesos + " MXN equivalen a $" + resultado + " CAD.");
                break;
            case 9:
                resultado = pesos * 2.20;
                System.out.println("$" + pesos + " MXN equivalen a " + resultado + " VES.");
                break;
            case 10:
                resultado = pesos * 49.0;
                System.out.println("$" + pesos + " MXN equivalen a $" + resultado + " ARS.");
                break;
            default:
                System.out.println("Error: Opcion de moneda no valida.");
                break;
        }
    }
}
