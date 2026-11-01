import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IngresoBodega bodega = new IngresoBodega();

        System.out.println("=== SISTEMA DE INGRESO A BODEGA ===");

        char continuar = 's';
        while (continuar == 's' || continuar == 'S') {
            System.out.print("\nIngrese el destino de la tina (Venta / Desperdicio): ");
            String destino = scanner.next();

            double peso = 0;
            if (destino.equalsIgnoreCase("Venta")) {
                System.out.print("Ingrese el peso neto de la tina en kg: ");
                peso = scanner.nextDouble();
            }

            // Creamos la tina y la registramos en la bodega
            Tina tina = new Tina(peso, destino);
            bodega.registrarTina(tina);

            System.out.print("¿Desea registrar otra tina? (s/n): ");
            continuar = scanner.next().charAt(0);
        }

        System.out.println("\n");
        // Generamos el informe de cierre final
        bodega.generarInforme();
        
        scanner.close();
    }
}

