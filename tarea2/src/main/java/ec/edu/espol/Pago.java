package ec.edu.espol;

public class Pago {
    private Reserva reserva;
    private MetodoPago metodoPago;

    public void procesar() {
        metodoPago.pagar(100.0);
    }
}
