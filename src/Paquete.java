public class Paquete {

    private String codigo;
    private String destino;
    private String estado; // "En Depósito", "En Tránsito", "Entregado"

    public Paquete(String codigo, String destino) {
        this.codigo = codigo;
        this.destino = destino;
        this.estado = "En Depósito"; // todo paquete arranca en depósito
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDestino() {
        return destino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Paquete " + codigo + " -> " + destino + " [" + estado + "]";
    }
}