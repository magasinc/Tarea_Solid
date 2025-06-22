package ec.edu.espol;

import java.util.List;

public class Reserva {
    private String id;
    private Usuario usuario;
    private Cabina cabina;
    private List<ServicioAdicional> servicios;
    private String estado;

    public void confirmar() {}
    public void cancelar() {}
    public void reprogramar() {}
    public int calcularCostoTotal() { return 0; }
}
