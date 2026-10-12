import java.util.ArrayList;
import java.util.List;

public class CamionDeReparto {

    private String patente;
    private List<Paquete> paquetes;

    public CamionDeReparto(String patente) {
        this.patente = patente;
        this.paquetes = new ArrayList<>();
    }

    public String getPatente() {
        return patente;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void asignarPaquete(Paquete paquete) {
        paquetes.add(paquete);
    }

    public boolean actualizarEstadoPaquete(String codigoPaquete, String nuevoEstado) {

        for (Paquete p : paquetes) {
            if (p.getCodigo().equals(codigoPaquete)) {
                p.setEstado(nuevoEstado);
                System.out.println("Camión " + patente + ": paquete " + codigoPaquete
                        + " actualizado a \"" + nuevoEstado + "\".");
                return true;
            }
        }

        // No se encontró en este camión
        return false;
    }

    public void actualizarTodos(String nuevoEstado) {
        for (Paquete p : paquetes) {
            p.setEstado(nuevoEstado);
        }
        System.out.println("Camión " + patente + ": " + paquetes.size()
                + " paquete(s) actualizados a \"" + nuevoEstado + "\".");
    }

    public void mostrarPaquetes() {
        System.out.println("Camión " + patente + ":");
        for (Paquete p : paquetes) {
            System.out.println("   " + p);
        }
    }
}