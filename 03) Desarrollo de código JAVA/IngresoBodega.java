import java.util.ArrayList;
import java.util.List;

public class IngresoBodega {
    private List<Tina> loteTinas = new ArrayList<>();

    public void registrarTina(Tina tina) {
        loteTinas.add(tina);
    }

    public void generarInforme() {
        int completas = 0;
        int incompletas = 0;
        int excedentes = 0;

        for (Tina t : loteTinas) {
            String estado = t.evaluarEstado();
            if (estado.equals("Tina Completa")) completas++;
            else if (estado.equals("Tina Incompleta")) incompletas++;
            else if (estado.equals("Tina con Excedente")) excedentes++;
        }

        System.out.println("--- INFORME DE CIERRE ---");
        System.out.println("Tinas Completas: " + completas);
        System.out.println("Tinas Incompletas: " + incompletas);
        System.out.println("Tinas con Excedente: " + excedentes);
    }
 }
