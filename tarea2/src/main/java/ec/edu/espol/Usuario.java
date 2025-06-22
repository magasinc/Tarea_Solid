package ec.edu.espol;

public class Usuario implements Notificable {
    private String id;
    private String nombre;
    private String email;

    public void buscarCrucero() {}
    public void reservarCabina() {}
    public void pagarReserva() {}
    public void reportarIncidente() {}

    @Override
    public void recibirNotificaciones(Mensaje mensaje) {
        // lógica de notificación
    }
}
