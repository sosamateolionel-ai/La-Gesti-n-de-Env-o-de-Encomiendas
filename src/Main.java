void main() {

    CentroLogistico centro = new CentroLogistico();

    CamionDeReparto camion1 = new CamionDeReparto("AC873QF");
    CamionDeReparto camion2 = new CamionDeReparto("EF456GH");

    camion1.asignarPaquete(new Paquete("PQ-001", "Mendoza Capital"));
    camion1.asignarPaquete(new Paquete("PQ-002", "Godoy Cruz"));
    camion2.asignarPaquete(new Paquete("PQ-003", "San Martín"));
    camion2.asignarPaquete(new Paquete("PQ-004", "Maipú"));

    centro.agregarCamion(camion1);
    centro.agregarCamion(camion2);

    centro.mostrarEstadoFlota();

    // Mensaje masivo: todos salen a reparto
    centro.difundirActualizacion("En Tránsito");

    // Mensaje dirigido: un paquete se entrega
    centro.actualizarPaquete("PQ-003", "Entregado");

    // Mensaje dirigido a un paquete inexistente
    centro.actualizarPaquete("PQ-999", "Entregado");

    centro.mostrarEstadoFlota();

}