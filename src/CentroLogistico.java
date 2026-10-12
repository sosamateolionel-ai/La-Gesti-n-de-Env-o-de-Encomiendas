import java.util.ArrayList;
import java.util.List;

public class CentroLogistico {

    private List<CamionDeReparto> camiones;

    public CentroLogistico() {
        this.camiones = new ArrayList<>();
    }

    public void agregarCamion(CamionDeReparto camion) {
        camiones.add(camion);
        System.out.println("Camión agregado a la flota: " + camion.getPatente());
    }

    // Mensaje masivo: todos los camiones actualizan todos sus paquetes
    public void difundirActualizacion(String nuevoEstado) {

        System.out.println("\n=== Difundiendo orden: " + nuevoEstado + " ===");

        for (CamionDeReparto c : camiones) {
            c.actualizarTodos(nuevoEstado);
        }
    }

    // Mensaje dirigido: busca el paquete en la flota
    public void actualizarPaquete(String codigoPaquete, String nuevoEstado) {

        System.out.println("\n=== Actualizando paquete " + codigoPaquete + " ===");

        for (CamionDeReparto c : camiones) {
            if (c.actualizarEstadoPaquete(codigoPaquete, nuevoEstado)) {
                return; // ya se encontró, no hace falta seguir
            }
        }

        System.out.println("Ningún camión tiene el paquete " + codigoPaquete + ".");
    }

    public void mostrarEstadoFlota() {
        System.out.println("\n=== Estado de la flota ===");
        for (CamionDeReparto c : camiones) {
            c.mostrarPaquetes();
        }
    }
}